package practica10dfl;

public class DeadLockPruebaDFL {
    public static void main(String[] args) {
        RecursoCompartidoDFL recurso = new RecursoCompartidoDFL();

        Thread t1 = new Thread(() -> recurso.metodoA());
        Thread t2 = new Thread(() -> recurso.metodoB());

        t1.start();
        t2.start();
    }
}
