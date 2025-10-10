package practica8dfl;

public class UsuarioDFL {
    private String nombre;
    private String matricula;

    public UsuarioDFL(String nombre, String matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return nombre + " (" + matricula + ")";
    }
}
