package practica9dfl;

import java.io.*;
import java.util.*;

public class ProcesadorCSVFlores {

    // Leer CSV y devolver lista de objetos PersonaDFLSerializable
    public static List<PersonaDFLSerializable> leerCSV(String ruta) throws IOException {
        List<PersonaDFLSerializable> personas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            boolean primera_linea = true;
            while ((linea = br.readLine()) != null) {
                if (primera_linea){
                    primera_linea =  false;
                    continue;
                }
                String[] campos = linea.split(",");
                if (campos.length == 3) {
                    String nombre = campos[0];
                    int edad = Integer.parseInt(campos[1]);
                    String contraseña = campos[2];
                    personas.add(new PersonaDFLSerializable(nombre, edad, contraseña));
                }
            }
        }
        return personas;
    }

    // Escribir lista de objetos PersonaDFLSerializable en CSV
    public static void escribirCSV(String ruta, List<PersonaDFLSerializable> personas) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))) {
            for (PersonaDFLSerializable p : personas) {
                bw.write(p.getNombre() + "," + p.getEdad() + "," + p.getContraseña());
                bw.newLine();
            }
        }
    }
}
