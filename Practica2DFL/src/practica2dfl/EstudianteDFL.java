package practica2dfl;

/**
 *
 * @author a
 */

public class EstudianteDFL {
    public enum Carrera{
        LCC, LSTI, LA, LM, LF, LMAD
    }
    
    String nombre;
    int matricula;
    int edad;
    Carrera carrera;
    int semestreActual;
    
    /*
    Constructor 1
    Constructor completo
    */
    public EstudianteDFL(String nombre, int matricula, int edad, Carrera carrera, int semestreActual) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.edad = edad;
        this.carrera = carrera;
        this.semestreActual = semestreActual;
    }
    
    /*
    Constructor 2
    Constructor para aspirantes de nuevo ingreso
    */
    public EstudianteDFL(String nombre, int edad, Carrera carrera) {
        this.nombre = nombre;
        this.matricula = -1;
        this.edad = edad;
        this.carrera = carrera;
        this.semestreActual = -1;
    }
    
    /*
    Constructor 3
    Constructor para LCC's
    */
    public EstudianteDFL(String nombre, int matricula, int edad, int semestreActual) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.edad = edad;
        this.carrera = Carrera.LCC;
        this.semestreActual = semestreActual;
    }
    
    /*
    Método de instancia 1
    Aceptar aspirante de nuevo ingreso
    */
    public void completarRegistro(int matricula){
        this.matricula = matricula;
        this.semestreActual = 1;
    }
    
    /*
    Método de instancia 2
    Verficar si el estudiante necesita completar su registro
    */
    
    public boolean necesitaCompletarRegistro(){
        return semestreActual == -1 || matricula == -1;
    }
    
    /*
    Método de instancia 3
    Cambiar carrera
    */
    public void cambiarCarrera(Carrera carrera){
        this.carrera = carrera;
    }
    
    /*
    Método de instancia 4
    Cambiar edad
    */
    public void cambiarEdad(int edad){
        this.edad = edad;
    }
    
    /*
    Método de instancia 5
    Cambiar semestre
    */
    public void cambiarSemestre(int semestre){
        this.semestreActual = semestre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getMatricula() {
        return matricula;
    }

    public int getEdad() {
        return edad;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public int getSemestreActual() {
        return semestreActual;
    }
}
