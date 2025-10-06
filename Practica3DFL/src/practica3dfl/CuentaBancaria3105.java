package practica3dfl;
import java.util.Scanner;

public class CuentaBancaria3105 {
    private int matricula_valida = 6033;
    private Scanner scanner = new Scanner(System.in);
    
    private String num_cuenta;
    private double saldo;
    public enum Banco{
        Banamex, Banorte, BBVA, Banregio
    }
    private Banco banco;
    private String clave_acceso;
    
    //Constructor
    CuentaBancaria3105(String num_cuenta, double saldo, Banco banco, String clave_acceso) {
        this.num_cuenta = num_cuenta;
        this.saldo = saldo;
        this.banco = banco;
        this.clave_acceso = clave_acceso;
    }

    /*
    -------------GETTERS & SETTERS-------------
    */
    public String getNum_cuenta() {
        return num_cuenta;
    }

    public void setNum_cuenta(String num_cuenta) {
        if(validarConMatricula()){
            this.num_cuenta = num_cuenta;
        } else {
            System.out.println("Matricula invalida, operación cancelada...");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if(validarConMatricula()){
            this.saldo = saldo;
        } else {
            System.out.println("Matricula invalida, operación cancelada...");
        }
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        if(validarConMatricula()){
                this.banco = banco;
        } else {
            System.out.println("Matricula invalida, operación cancelada...");
        }
    }

    public String getClave_acceso() {
        return clave_acceso;
    }

    public void setClave_acceso(String clave_acceso) {
        if(validarConMatricula()){
            this.clave_acceso = clave_acceso;
        } else {
            System.out.println("Matricula invalida, operación cancelada...");
        }
    }

    
    private boolean validarConMatricula(){
        // Validar matrícula
        System.out.print("Ingrese los últimos dígitos de la matrícula: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ingresa un número válido. Intenta de nuevo:");
            scanner.next();
        }
        int matricula = scanner.nextInt();
        scanner.nextLine();
        
        return matricula == matricula_valida;
    }
    
    @Override
    public String toString(){
        return "Numero de cuenta: " + this.getNum_cuenta() + "\n"
             + "Saldo: $"  + this.getSaldo() + "\n"
             + "Banco: " + this.getBanco();
    }
    
}
