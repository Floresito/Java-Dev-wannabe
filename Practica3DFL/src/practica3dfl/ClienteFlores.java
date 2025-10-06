package practica3dfl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClienteFlores {
    protected String nombre;
    protected String direccion;
    private List<CuentaBancaria3105> cuentas;

    public ClienteFlores(String nombre, String direccion, String numCuenta, double saldo, CuentaBancaria3105.Banco banco, String claveAcceso) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cuentas = new ArrayList<>();

        CuentaBancaria3105 cuentaInicial = new CuentaBancaria3105(numCuenta, saldo, banco, claveAcceso);
        cuentas.add(cuentaInicial);
    }

    public void crearCuentaAdicional(String numCuenta, double saldo, CuentaBancaria3105.Banco banco,String claveAcceso) {
        CuentaBancaria3105 nuevaCuenta = new CuentaBancaria3105(numCuenta, saldo, banco, claveAcceso);
        cuentas.add(nuevaCuenta);
        System.out.println("Cuenta creada y agregada exitosamente.");
        
    }

    public void mostrarResumenDeCuentas() {
        System.out.println("Resumen de cuentas del cliente: " + nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("Total de cuentas: " + cuentas.size());

        for (CuentaBancaria3105 cuenta : cuentas) {
            System.out.println("-----------------------------");
            System.out.println(cuenta);
        }
    } 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<CuentaBancaria3105> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<CuentaBancaria3105> cuentas) {
        this.cuentas = cuentas;
    }
    
}
