package practica10dfl;

public class ClienteRunnable05 implements Runnable{
    private CuentaBancariaDFL cuenta;

    public ClienteRunnable05(CuentaBancariaDFL cuenta) {
        this.cuenta = cuenta;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            cuenta.depositar(200);
            try { Thread.sleep(50); } catch (InterruptedException e) {}
        }
    }
}
