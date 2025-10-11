package practica6dfl;

public class DesarrolladorFlores extends EmpleadoDF implements Bonificable31, Evaluable05, Promovible6033 {
    public DesarrolladorFlores(String nombre, String apellido, int edad, double salario) {
        super(nombre, apellido, edad, salario);
    }

    @Override
    public void trabajar() {
        System.out.println("Hola soy el desarrollador y estoy programando.");
    }

    @Override
    public void recibirBono(double monto) {
        salario += monto;
        System.out.println("Desarrollador recibió un bono de $" + monto);
    }

    @Override
    public void evaluarDesempeño() {
        System.out.println("Desempeño técnico evaluado.");
    }

    @Override
    public void promover() {
        System.out.println("Desarrollador promovido a Líder Técnico.");
    }
}

