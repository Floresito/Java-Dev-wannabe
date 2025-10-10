package practica8dfl;
import java.util.Scanner;

public class Practica8DFL {

    public static void main(String[] args) {
        // TODO code application logic here
        BibliotecaDFL6033 biblioteca = new BibliotecaDFL6033();
        Scanner sc = new Scanner(System.in);
        int opcion;

        // Datos de prueba personalizados
        biblioteca.agregarLibro(new Libro3105("Java Avanzado", "Diego F. López", 2025, "Programación"));
        biblioteca.agregarLibro(new Libro3105("Estructuras de Datos", "Ana Torres", 2023, "Informática"));
        biblioteca.registrarUsuario("DFL6033", new UsuarioDFL("Diego", "DFL6033"));

        long inicio, fin;

        do {
            System.out.println("\n--- Menú Biblioteca ---");
            System.out.println("1. Mostrar libros");
            System.out.println("2. Buscar libro");
            System.out.println("3. Ordenar por autor");
            System.out.println("4. Reservar libro");
            System.out.println("5. Mostrar reservas");
            System.out.println("6. Mostrar categorías");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt(); sc.nextLine();

            switch (opcion) {
                case 1:
                    biblioteca.mostrarLibrosOrdenadosPor(ComparadoresLibrosDFL.porAutor);
                    break;
                case 2:
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    inicio = System.nanoTime();
                    Libro3105 libro = biblioteca.buscarLibro(titulo);
                    fin = System.nanoTime();
                    System.out.println(libro != null ? libro : "No encontrado");
                    System.out.println("Tiempo de búsqueda: " + (fin - inicio) + " ns");
                    break;
                case 3:
                    biblioteca.mostrarLibrosOrdenadosPor(ComparadoresLibrosDFL.porAutor);
                    break;
                case 4:
                    System.out.print("Título a reservar: ");
                    String res = sc.nextLine();
                    Libro3105 l = biblioteca.buscarLibro(res);
                    if (l != null) biblioteca.reservarLibro(l);
                    break;
                case 5:
                    biblioteca.mostrarReservas();
                    break;
                case 6:
                    biblioteca.mostrarCategorias();
                    break;
            }
        } while (opcion != 0);
    }
    
}
