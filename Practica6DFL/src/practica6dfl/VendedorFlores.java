package practica6dfl;

public class VendedorFlores extends EmpleadoDF implements Bonificable31, Evaluable05, Promovible6033 {
    public VendedorFlores(String nombre, String apellido, int edad, double salario) {
        super(nombre, apellido, edad, salario);
    }

    @Override
    public void trabajar() {
        System.out.println("Hola soy el vendedor y estoy vendiendo.");
    }

    @Override
    public void recibirBono(double monto) {
        salario += monto;
        System.out.println("Vendedor recibió un bono de $" + monto);
    }

    @Override
    public void evaluarDesempeño() {
        System.out.println("Evaluación de ventas realizada.");
    }

    @Override
    public void promover() {
        System.out.println("Vendedor promovido a Supervisor de Ventas.");
    }
}

