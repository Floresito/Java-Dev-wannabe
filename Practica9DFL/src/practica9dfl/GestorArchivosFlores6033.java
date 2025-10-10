package practica9dfl;
import java.io.*;
import java.nio.file.*;
import java.util.List;

public class GestorArchivosFlores6033 {

    // Lectura de archivo de texto
    public static List<String> leerArchivoTexto(String ruta) throws IOException {
        return Files.readAllLines(Paths.get(ruta));
    }

    // Escritura en archivo de texto
    public static void escribirArchivoTexto(String ruta, String contenido) throws IOException {
        Files.write(Paths.get(ruta), contenido.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    }

    // Escritura binaria
    public static void escribirBinario(String ruta, byte[] datos) throws IOException {
        Files.write(Paths.get(ruta), datos);
    }

    // Lectura binaria
    public static byte[] leerBinario(String ruta) throws IOException {
        return Files.readAllBytes(Paths.get(ruta));
    }

    // Crear directorio
    public static void crearDirectorio(String ruta) throws IOException {
        Files.createDirectories(Paths.get(ruta));
    }

    // Listar archivos en directorio
    public static void listarArchivos(String ruta) {
        File dir = new File(ruta);
        if (dir.isDirectory()) {
            for (File archivo : dir.listFiles()) {
                System.out.println(archivo.getName());
            }
        }
    }
}
