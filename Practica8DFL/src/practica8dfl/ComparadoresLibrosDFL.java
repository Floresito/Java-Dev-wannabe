package practica8dfl;
import java.util.Comparator;

public class ComparadoresLibrosDFL {
    public static Comparator<Libro3105> porAutor = Comparator.comparing(Libro3105::getAutor);
    public static Comparator<Libro3105> porAño = Comparator.comparingInt(Libro3105::getAño);
    public static Comparator<Libro3105> porCategoria = Comparator.comparing(Libro3105::getCategoria);
}
