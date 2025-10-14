package practica10dfl;

public class CajeroThread31 extends Thread{
    private CuentaBancariaDFL cuenta;

    public CajeroThread31(CuentaBancariaDFL cuenta) {
        this.cuenta = cuenta;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            cuenta.retirar(100);
            try { Thread.sleep(50); } catch (InterruptedException e) {}
        }
    }
}
