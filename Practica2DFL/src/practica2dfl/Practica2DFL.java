package practica2dfl;
import java.util.Scanner;

/**
 *
 * @author a
 */
public class Practica2DFL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Universidad6033 universidad = new Universidad6033();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        //Estudiantes por default
        //Constructor 1
        EstudianteDFL estudiante1 = new EstudianteDFL("Luis SegoBia", 1001, 20, EstudianteDFL.Carrera.LA, 3);
        EstudianteDFL estudiante2 = new EstudianteDFL("Rodrigo Zacatenco", 1002, 22, EstudianteDFL.Carrera.LSTI, 5);

        //Constructor 2
        EstudianteDFL estudiante3 = new EstudianteDFL("Ernesto Chavana", 18, EstudianteDFL.Carrera.LMAD);
        EstudianteDFL estudiante4 = new EstudianteDFL("Pepito Pepe", 19, EstudianteDFL.Carrera.LF);

        //Constructor 3
        EstudianteDFL estudiante5 = new EstudianteDFL("Esmeralda Mendieta", 1005, 21, 4);

        universidad.estudiantes[universidad.total_estudiantes++] = estudiante1;
        universidad.estudiantes[universidad.total_estudiantes++] = estudiante2;
        universidad.estudiantes[universidad.total_estudiantes++] = estudiante3;
        universidad.estudiantes[universidad.total_estudiantes++] = estudiante4;
        universidad.estudiantes[universidad.total_estudiantes++] = estudiante5;
        
        do{
            System.out.println("Universidad6033");
            System.out.println("Seleccione una opcion:\n"
                                + "1. Agregar estudiante de nuevo ingreso\n"
                                + "2. Agregar estudiante existente\n"
                                + "3. Buscar estudiante\n"
                                + "4. Mostrar estudiante(s)\n"
                                + "5. Salir\n");

            System.out.print("Ingrese la opción (1-5): ");
            
            while (!scanner.hasNextInt()) {
                System.out.println("Ingresa una opción válida: ");
                scanner.next();
            }
            
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            while (opcion < 1 || opcion > 5) {
                System.out.println("Ingresa una opción válida: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Ingresa una opción válida: ");
                    scanner.next();
                }
                opcion = scanner.nextInt();
                scanner.nextLine();
            }

            switch (opcion) {
                //Aspirante a nuevo ingreso
                case 1:
                    universidad.agregarEstudianteNuevoIngreso();
                    break;
                //Estudiante nuevo, pero ya existente
                case 2:
                    universidad.agregarEstudianteExistente();
                    break;
                case 3:
                    if (universidad.total_estudiantes == 0) {
                        System.out.println("No hay estudiantes registrados.");
                        break;
                    }
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
                    universidad.buscarEstudiantePorMatricula(matricula);
                    break;
                case 4:
                    universidad.mostrarEstudiantes();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Opción no valida");
            }
        } while (opcion != 5);
    }
}