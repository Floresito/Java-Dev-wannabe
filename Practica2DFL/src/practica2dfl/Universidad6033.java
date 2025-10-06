package practica2dfl;
import java.util.Scanner;
import org.apache.commons.lang3.EnumUtils;

public class Universidad6033 {
    Scanner scanner = new Scanner(System.in);
    EstudianteDFL[] estudiantes = new EstudianteDFL[30];
    int total_estudiantes = 0;
    
    public void agregarEstudianteNuevoIngreso(){
        //Validar nombre
        System.out.print("Ingresa el nombre del estudiante: ");
        String nombre = scanner.nextLine().trim();
        while (nombre.isEmpty()) {
            System.out.println("El nombre no puede estar vacío. Intenta de nuevo:");
            nombre = scanner.nextLine().trim();
        }

        // Validar edad
        System.out.print("Ingresa la edad del estudiante: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ingresa un número válido. Intenta de nuevo:");
            scanner.next();
        }
        int edad = scanner.nextInt();
        scanner.nextLine();

        while (edad <= 0) {
            System.out.println("La edad debe ser positiva. Intenta de nuevo:");
            while (!scanner.hasNextInt()) {
                System.out.println("Ingresa un número válido. Intenta de nuevo:");
                scanner.next();
            }
            edad = scanner.nextInt();
            scanner.nextLine();
        }

        // Validar carrera
        System.out.print("Ingresa la carrera (LCC, LSTI, LA, LM, LF, LMAD): ");
        String entradaCarrera = scanner.nextLine().toUpperCase();

        while (!EnumUtils.isValidEnum(EstudianteDFL.Carrera.class, entradaCarrera)) {
            System.out.println("Carrera inválida. Intenta de nuevo:");
            entradaCarrera = scanner.nextLine().toUpperCase();
        }

        EstudianteDFL.Carrera carrera = EstudianteDFL.Carrera.valueOf(entradaCarrera);

        EstudianteDFL nuevoEstudiante = new EstudianteDFL(nombre, edad, carrera);
        
        if (total_estudiantes < estudiantes.length) {
            estudiantes[total_estudiantes++] = nuevoEstudiante;
        } else {
            System.out.println("No se pueden agregar más estudiantes. Límite alcanzado.");
        }
    }
    
    public void agregarEstudianteExistente(){
        //Validar nombre
        System.out.print("Ingresa el nombre del estudiante: ");
        String nombre = scanner.nextLine().trim();
        while (nombre.isEmpty()) {
            System.out.println("El nombre no puede estar vacío. Intenta de nuevo:");
            nombre = scanner.nextLine().trim();
        }

        // Validar matrícula
        System.out.print("Ingresa la matrícula (número entero positivo): ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ingresa un número válido. Intenta de nuevo:");
            scanner.next();
        }
        int matricula = scanner.nextInt();
        scanner.nextLine();

        while (matricula <= 0) {
            System.out.println("La matrícula debe ser un número positivo. Intenta de nuevo:");
            while (!scanner.hasNextInt()) {
                System.out.println("Ingresa un número válido. Intenta de nuevo:");
                scanner.next();
            }
            matricula = scanner.nextInt();
            scanner.nextLine();
        }

        // Validar edad
        System.out.print("Ingresa la edad del estudiante: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ingresa un número válido. Intenta de nuevo:");
            scanner.next();
        }
        int edad = scanner.nextInt();
        scanner.nextLine();

        while (edad <= 0) {
            System.out.println("La edad debe ser positiva. Intenta de nuevo:");
            while (!scanner.hasNextInt()) {
                System.out.println("Ingresa un número válido. Intenta de nuevo:");
                scanner.next();
            }
            edad = scanner.nextInt();
            scanner.nextLine();
        }

        // Validar carrera
        System.out.print("Ingresa la carrera (LCC, LSTI, LA, LM, LF, LMAD): ");
        String entradaCarrera = scanner.nextLine().toUpperCase();

        while (!EnumUtils.isValidEnum(EstudianteDFL.Carrera.class, entradaCarrera)) {
            System.out.println("Carrera inválida. Intenta de nuevo:");
            entradaCarrera = scanner.nextLine().toUpperCase();
        }

        EstudianteDFL.Carrera carrera = EstudianteDFL.Carrera.valueOf(entradaCarrera);

        // Validar semestre actual
        System.out.print("Ingresa el semestre actual (1 o mayor): ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ingresa un número válido. Intenta de nuevo:");
            scanner.next();
        }
        int semestreActual = scanner.nextInt();
        scanner.nextLine();

        while (semestreActual < 1) {
            System.out.println("El semestre debe ser 1 o mayor. Intenta de nuevo:");
            while (!scanner.hasNextInt()) {
                System.out.println("Ingresa un número válido. Intenta de nuevo:");
                scanner.next();
            }
            semestreActual = scanner.nextInt();
            scanner.nextLine();
        }

        EstudianteDFL nuevoEstudiante = new EstudianteDFL(nombre, matricula, edad, carrera, semestreActual);
        
        if (total_estudiantes < estudiantes.length) {
            estudiantes[total_estudiantes++] = nuevoEstudiante;
        } else {
            System.out.println("No se pueden agregar más estudiantes. Límite alcanzado.");
        }
    }
    
    public void buscarEstudiantePorMatricula(int matricula){
               
        boolean encontrado = false;

        for (int i = 0; i < total_estudiantes; i++) {
            EstudianteDFL e = estudiantes[i];
            if (e.getMatricula() == matricula) {
                System.out.println("Estudiante encontrado:");
                System.out.println("Nombre: " + e.getNombre());
                System.out.println("Edad: " + e.getEdad());
                System.out.println("Carrera: " + e.getCarrera());
                System.out.println("Semestre actual: " + e.getSemestreActual());
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró ningún estudiante con matrícula " + matricula);
        }
    }
    
    public void mostrarEstudiantes() {
        if (total_estudiantes == 0) {
            System.out.println("No hay estudiantes registrados.");
            return;
        }

        System.out.println("Lista de estudiantes:");
        for (int i = 0; i < total_estudiantes; i++) {
            EstudianteDFL e = estudiantes[i];
            if (e.getMatricula() == -1){
                System.out.println("Nombre: " + e.getNombre());
                System.out.println("Matrícula: ASPIRANTE A NUEVO INGRESO");
                System.out.println("Edad: " + e.getEdad());
                System.out.println("Carrera: " + e.getCarrera());
                System.out.println("Semestre actual: ASPIRANTE A NUEVO INGRESO");
                System.out.println("-----------------------------");
            } else {
                System.out.println("Nombre: " + e.getNombre());
                System.out.println("Matrícula: " + e.getMatricula());
                System.out.println("Edad: " + e.getEdad());
                System.out.println("Carrera: " + e.getCarrera());
                System.out.println("Semestre actual: " + e.getSemestreActual());
                System.out.println("-----------------------------");
            }
        }
    }
    
}
