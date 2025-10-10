package practica4dfl;

public class VehiculoBaseDFL {
    private String propietario;
    int anio;
    double precio_base;
    Color color;
    Tipo tipo;
    
    public enum Tipo{
        Automatico, Manual
    }
    public enum Color{
        Rojo, Cafe, Negro, Blanco
    }

    public VehiculoBaseDFL(String propietario, int anio, double precio_base, Color color, Tipo tipo) {
        this.propietario = propietario;
        this.anio = anio;
        this.precio_base = precio_base;
        this.color = color;
        this.tipo = tipo;
    }
    
    public void mostrarFichaTecnica() {
        System.out.println("Propietario: " + propietario);
        System.out.println("Año: " + anio);
        System.out.println("Precio base: $" + precio_base);
        System.out.println("Color: " + color);
        System.out.println("Tipo de transmisión: " + tipo);
    }

    public double calcularImpuesto() {
        return precio_base * 0.10; // 10% de impuesto base
    }

    public String descripcionUso() {
        return "Vehículo de uso general.";
    }

    public int obtenerEdad(int añoActual) {
        return añoActual - anio;
    }

    public boolean esAutomatico() {
        return tipo == Tipo.Automatico;
    }


    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getPrecio_base() {
        return precio_base;
    }

    public void setPrecio_base(double precio_base) {
        this.precio_base = precio_base;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    
    
    
}
