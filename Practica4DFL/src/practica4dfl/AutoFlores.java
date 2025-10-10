package practica4dfl;

public class AutoFlores extends VehiculoBaseDFL{
    int num_puertas;
    boolean tiene_AC;
    TipoCombustible combustible;
    
    public enum TipoCombustible {
        Gasolina, Electrico, Hibrido
    }

    public AutoFlores(int num_puertas, boolean tiene_AC, TipoCombustible combustible, String propietario, int anio, double precio_base, Color color, Tipo tipo) {
        super(propietario, anio, precio_base, color, tipo);
        this.num_puertas = num_puertas;
        this.tiene_AC = tiene_AC;
        this.combustible = combustible;
    }
    
    @Override
    public void mostrarFichaTecnica() {
        super.mostrarFichaTecnica();
        System.out.println("Número de puertas: " + num_puertas);
        System.out.println("Tiene A/C: " + tiene_AC);
        System.out.println("Tipo de combustible: " + combustible);
    }

    @Override
    public double calcularImpuesto() {
        return getPrecio_base() * 0.12; // 12% de impuesto para autos
    }

    @Override
    public String descripcionUso() {
        return "Auto para transporte personal.";
    }

    
    public int getNum_puertas() {
        return num_puertas;
    }

    public void setNum_puertas(int num_puertas) {
        this.num_puertas = num_puertas;
    }

    public boolean isTiene_AC() {
        return tiene_AC;
    }

    public void setTiene_AC(boolean tiene_AC) {
        this.tiene_AC = tiene_AC;
    }

    public TipoCombustible getCombustible() {
        return combustible;
    }

    public void setCombustible(TipoCombustible combustible) {
        this.combustible = combustible;
    }
    
    
    
}
