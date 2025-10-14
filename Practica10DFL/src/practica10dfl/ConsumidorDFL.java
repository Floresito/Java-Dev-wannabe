package practica10dfl;

public class ConsumidorDFL implements Runnable{
    private BufferDFL buffer;

    public ConsumidorDFL(BufferDFL buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try {
            for (int i = 0; i < 100; i++) buffer.consumir();
        } catch (InterruptedException e) {
            System.out.println("[Consumidor interrumpido]");
        }
    }
}
