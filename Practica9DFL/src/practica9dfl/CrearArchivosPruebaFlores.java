package practica9dfl;
import java.io.*;
import java.util.*;

public class CrearArchivosPruebaFlores {

    public static void generarArchivos() throws IOException {
        // Archivo de texto "datos_[matricula].txt"
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("datos_2066033.txt"))) {
            bw.write("Este es un archivo de prueba para la matrícula 2066033.");
            bw.newLine();
            bw.write("Generado por Diego Flores.");
        }

        // Archivo binario "backup_[diaNacimiento][mesNacimiento].dat"
        byte[] contenidoBinario = {31, 5, 20, 66, 33}; // contenido arbitrario
        try (FileOutputStream fos = new FileOutputStream("backup_3105.dat")) {
            fos.write(contenidoBinario);
        }

        // Archivo CSV "log_[apellidoPaterno].csv"
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("log_Flores.csv"))) {
            bw.write("nombre,edad,contraseña");
            bw.newLine();
            bw.write("Diego,20,2066033");
            bw.newLine();
            bw.write("Ana,21,segura456");
        }

        System.out.println("Archivos de prueba generados correctamente.");
    }
}
