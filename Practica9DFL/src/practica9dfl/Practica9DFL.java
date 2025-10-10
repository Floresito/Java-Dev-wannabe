package practica9dfl;

import java.util.*;
import java.io.*;

public class Practica9DFL {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcion;

        System.out.println("=== Bienvenido al Gestor de Archivos Flores6033 ===");

        do {
            System.out.println("\nOpciones disponibles:");
            System.out.println("1. Generar archivos de prueba");
            System.out.println("2. Serializar persona");
            System.out.println("3. Deserializar persona");
            System.out.println("4. Procesar archivo CSV");
            System.out.println("5. Crear backup automático");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextLine();

            try {
                switch (opcion) {
                    case "1":
                        CrearArchivosPruebaFlores.generarArchivos();
                        break;

                    case "2":
                        System.out.print("Nombre: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Edad: ");
                        int edad = Integer.parseInt(scanner.nextLine());
                        System.out.print("Contraseña: ");
                        String contraseña = scanner.nextLine();

                        PersonaDFLSerializable persona = new PersonaDFLSerializable(nombre, edad, contraseña);
                        persona.serializar("persona.ser");
                        System.out.println("Persona serializada en 'persona.ser'");
                        break;

                    case "3":
                        PersonaDFLSerializable cargada = PersonaDFLSerializable.deserializar("persona.ser");
                        System.out.println("Persona deserializada:");
                        System.out.println(cargada);
                        break;

                    case "4":
                        List<PersonaDFLSerializable> personas = ProcesadorCSVFlores.leerCSV("log_Flores.csv");
                        System.out.println("Registros CSV:");
                        for (PersonaDFLSerializable p : personas) {
                            System.out.println(p);
                        }
                        break;

                    case "5":
                        BackupFlores.crearBackup("datos_2066033.txt", "respaldos");
                        break;

                    case "6":
                        System.out.println("Saliendo del sistema. ¡Hasta luego!");
                        break;

                    default:
                        System.out.println("Opción no válida. Intenta de nuevo.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (!opcion.equals("6"));

        scanner.close();
    }
}