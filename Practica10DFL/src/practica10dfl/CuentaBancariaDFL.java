package practica10dfl;

public class CuentaBancariaDFL {
    private int saldo = 1000;

    public synchronized void retirar(int cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
            System.out.println("[Retiro] -" + cantidad + " | Saldo: " + saldo);
        } else {
            System.out.println("[Retiro fallido] Saldo insuficiente");
        }
    }

    public synchronized void depositar(int cantidad) {
        saldo += cantidad;
        System.out.println("[Depósito] +" + cantidad + " | Saldo: " + saldo);
    }

    public synchronized int getSaldo() {
        return saldo;
    }
}
