package practica10dfl;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BancoConcurrenteDF {
    public static void main(String[] args) throws InterruptedException {
        long inicio = System.nanoTime();

        CuentaBancariaDFL cuenta = new CuentaBancariaDFL();
        BufferDFL buffer = new BufferDFL();

        CajeroThread31 cajero = new CajeroThread31(cuenta);
        Thread cliente = new Thread(new ClienteRunnable05(cuenta));

        ExecutorService threadPoolFlores = Executors.newFixedThreadPool(4);
        threadPoolFlores.submit(new ProductorDFL(buffer));
        threadPoolFlores.submit(new ConsumidorDFL(buffer));

        cajero.start();
        cliente.start();

        cajero.join();
        cliente.join();

        threadPoolFlores.shutdown();

        long fin = System.nanoTime();
        System.out.println("[Tiempo total] " + (fin - inicio) / 1_000_000 + " ms");
    }
}
