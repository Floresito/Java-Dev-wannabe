package practica10dfl;

public class RecursoCompartidoDFL {
    private final Object lockA = new Object();
    private final Object lockB = new Object();

    public void metodoA() {
        synchronized (lockA) {
            try { Thread.sleep(50); } catch (InterruptedException e) {}
            synchronized (lockB) {
                System.out.println("[Acceso A]");
            }
        }
    }

    public void metodoB() {
        synchronized (lockB) {
            try { Thread.sleep(50); } catch (InterruptedException e) {}
            synchronized (lockA) {
                System.out.println("[Acceso B]");
            }
        }
    }
}
