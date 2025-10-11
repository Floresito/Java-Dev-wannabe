package practica6dfl;

public class GerenteFlores extends EmpleadoDF implements Bonificable31, Evaluable05, Promovible6033 {
    public GerenteFlores(String nombre, String apellido, int edad, double salario) {
        super(nombre, apellido, edad, salario);
    }

    @Override
    public void trabajar() {
        System.out.println("Hola soy el gerente y estoy trabajando.");
    }

    @Override
    public void recibirBono(double monto) {
        salario += monto;
        System.out.println("Gerente recibió un bono de $" + monto);
    }

    @Override
    public void evaluarDesempeño() {
        System.out.println("Evaluando desempeño del equipo.");
    }

    @Override
    public void promover() {
        System.out.println("Gerente promovido a Director.");
    }
}
