package practica10dfl;

public class ProductorDFL implements Runnable{
    private BufferDFL buffer;

    public ProductorDFL(BufferDFL buffer) {
        this.buffer = buffer;
    }

    public void run() {
        try {
            for (int i = 0; i < 100; i++) buffer.producir(i);
        } catch (InterruptedException e) {
            System.out.println("[Productor interrumpido]");
        }
    }
}
