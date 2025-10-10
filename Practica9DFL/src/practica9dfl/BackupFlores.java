package practica9dfl;

import java.io.*;
import java.nio.file.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BackupFlores {

    public static void crearBackup(String rutaOriginal, String carpetaDestino) throws IOException {
        // Crear carpeta si no existe
        Files.createDirectories(Paths.get(carpetaDestino));

        // Generar timestamp
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

        // Nombre del archivo de respaldo
        String nombreBackup = "backup_3105_" + timestamp + ".dat";
        Path destino = Paths.get(carpetaDestino, nombreBackup);

        // Copiar archivo
        Files.copy(Paths.get(rutaOriginal), destino, StandardCopyOption.REPLACE_EXISTING);

        System.out.println("Backup creado: " + destino.toString());
    }
}
