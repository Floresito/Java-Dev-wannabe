package com.example.practica11dfl;

import java.io.*;
import java.util.*;

public class EstudianteDFLDAO {
    private static final String FILE = "estudiantes.txt";

    public static List<EstudianteDFL> cargar() {
        List<EstudianteDFL> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 2) {
                    lista.add(new EstudianteDFL(partes[0], partes[1]));
                } else {
                    System.err.println("Línea inválida: " + linea);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public static void guardar(EstudianteDFL est) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE, true))) {
            bw.write(est.getNombre() + "," + est.getMatricula());
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void eliminar(EstudianteDFL est) {
        List<EstudianteDFL> lista = cargar();
        lista.removeIf(e -> e.getNombre().equals(est.getNombre()) && e.getMatricula().equals(est.getMatricula()));
        guardarLista(lista);
    }

    public static void editar(EstudianteDFL original, String nuevoNombre, String nuevaMatricula) {
        List<EstudianteDFL> lista = cargar();
        for (EstudianteDFL e : lista) {
            if (e.getNombre().equals(original.getNombre()) && e.getMatricula().equals(original.getMatricula())) {
                e.setNombre(nuevoNombre);
                e.setMatricula(nuevaMatricula);
                break;
            }
        }
        guardarLista(lista);
    }

    private static void guardarLista(List<EstudianteDFL> lista) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE, false))) {
            for (EstudianteDFL e : lista) {
                bw.write(e.getNombre() + "," + e.getMatricula());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}