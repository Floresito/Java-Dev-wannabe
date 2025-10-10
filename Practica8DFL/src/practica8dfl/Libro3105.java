package practica8dfl;

public class Libro3105 implements Comparable<Libro3105> {
    private String titulo;
    private String autor;
    private int año;
    private String categoria;

    public Libro3105(String titulo, String autor, int año, String categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
        this.categoria = categoria;
    }

    @Override
    public int compareTo(Libro3105 otro) {
        return this.titulo.compareToIgnoreCase(otro.titulo);
    }

    // Getters y toString
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAño() { return año; }
    public String getCategoria() { return categoria; }

    @Override
    public String toString() {
        return titulo + " - " + autor + " (" + año + ") [" + categoria + "]";
    }
}