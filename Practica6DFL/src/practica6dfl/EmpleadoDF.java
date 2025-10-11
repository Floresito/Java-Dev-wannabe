package practica6dfl;

public abstract class EmpleadoDF {
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected double salario;

    public EmpleadoDF(String nombre, String apellido, int edad, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: $" + salario);
    }

    public abstract void trabajar();
}

