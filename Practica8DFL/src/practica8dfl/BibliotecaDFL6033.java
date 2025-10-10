package practica8dfl;

import java.util.*;

public class BibliotecaDFL6033 {
    private ArrayList<Libro3105> librosDisponibles = new ArrayList<>();
    private LinkedList<Libro3105> colaReservas = new LinkedList<>();
    private HashMap<String, UsuarioDFL> usuariosRegistrados = new HashMap<>();
    private HashSet<String> categoriasUnicas = new HashSet<>();

    // Métodos CRUD para libros
    public void agregarLibro(Libro3105 libro) {
        librosDisponibles.add(libro);
        categoriasUnicas.add(libro.getCategoria());
    }

    public void eliminarLibro(String titulo) {
        librosDisponibles.removeIf(libro -> libro.getTitulo().equalsIgnoreCase(titulo));
    }

    public Libro3105 buscarLibro(String titulo) {
        return librosDisponibles.stream()
            .filter(libro -> libro.getTitulo().equalsIgnoreCase(titulo))
            .findFirst()
            .orElse(null);
    }

    public void mostrarLibrosOrdenadosPor(Comparator<Libro3105> criterio) {
        librosDisponibles.stream()
            .sorted(criterio)
            .forEach(System.out::println);
    }

    public void registrarUsuario(String matricula, UsuarioDFL usuario) {
        usuariosRegistrados.put(matricula, usuario);
    }

    public void reservarLibro(Libro3105 libro) {
        colaReservas.add(libro);
    }

    public void mostrarReservas() {
        Iterator<Libro3105> it = colaReservas.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public void mostrarCategorias() {
        categoriasUnicas.forEach(System.out::println);
    }
}
