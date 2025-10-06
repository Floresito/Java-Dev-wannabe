package practica3dfl;

public class Practica3DFL {

    public static void main(String[] args) {
        // Crear cliente con cuenta inicial
        ClienteFlores cliente1 = new ClienteFlores(
            "Diego",
            "Monterrey",
            "123456",
            5000.0,
            CuentaBancaria3105.Banco.Banorte,
            "clave123"
        );

        System.out.println("Cliente creado con cuenta inicial:");
        cliente1.mostrarResumenDeCuentas();

        // Crear cuenta adicional
        cliente1.crearCuentaAdicional(
            "654321",
            3000.0,
            CuentaBancaria3105.Banco.BBVA,
            "clave456"
        );

        System.out.println("\nDespués de agregar cuenta adicional:");
        cliente1.mostrarResumenDeCuentas();
        System.out.println("Nombre del cliente: " + cliente1.getNombre());
        System.out.println("Dirección del cliente: " + cliente1.getDireccion());
        System.out.println("Número de cuentas: " + cliente1.getCuentas().size());


        // Probar encapsulamiento: acceder a datos solo por getters
        System.out.println("\nVerificando datos por getters:");
        System.out.println("Nombre del cliente: " + cliente1.getNombre());
        System.out.println("Dirección del cliente: " + cliente1.getDireccion());
        System.out.println("Número de cuentas: " + cliente1.getCuentas().size());

        // Probar setters con validación de matrícula
        System.out.println("\nIntentando cambiar saldo con validación:");
        CuentaBancaria3105 cuenta = cliente1.getCuentas().get(0);
        cuenta.setSaldo(9999.0); // Esto pedirá matrícula por consola

        System.out.println("\nEstado final de las cuentas:");
        cliente1.mostrarResumenDeCuentas();
    }
    
}
