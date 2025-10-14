package practica10dfl;

import java.util.LinkedList;
import java.util.Queue;

public class BufferDFL {
    private final Queue<Integer> cola = new LinkedList<>();
    private final int capacidad = 6033;

    public synchronized void producir(int dato) throws InterruptedException {
        while (cola.size() == capacidad) wait();
        cola.add(dato);
        System.out.println("[Producido] " + dato);
        notifyAll();
    }

    public synchronized int consumir() throws InterruptedException {
        while (cola.isEmpty()) wait();
        int dato = cola.poll();
        System.out.println("[Consumido] " + dato);
        notifyAll();
        return dato;
    }
}
