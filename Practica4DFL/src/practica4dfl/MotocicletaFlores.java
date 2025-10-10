package practica4dfl;

public class MotocicletaFlores extends VehiculoBaseDFL{
    int cilindrada;
    boolean tieneParabrisas;
    TipoManillar manillar;
    
    public enum TipoManillar{
        Deportivo, Clasico, Elevado
    }

    public MotocicletaFlores(int cilindrada, boolean tieneParabrisas, TipoManillar manillar, String propietario, int anio, double precio_base, Color color, Tipo tipo) {
        super(propietario, anio, precio_base, color, tipo);
        this.cilindrada = cilindrada;
        this.tieneParabrisas = tieneParabrisas;
        this.manillar = manillar;
    }    
    
    @Override
    public void mostrarFichaTecnica() {
        super.mostrarFichaTecnica();
        System.out.println("Cilindrada: " + cilindrada + "cc");
        System.out.println("Tiene parabrisas: " + tieneParabrisas);
        System.out.println("Tipo de manillar: " + manillar);
    }

    @Override
    public double calcularImpuesto() {
        return getPrecio_base() * 0.08; // 8% de impuesto para motos
    }

    @Override
    public String descripcionUso() {
        return "Motocicleta para uso urbano y/o de trabajo.";
    }

    
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public boolean isTieneParabrisas() {
        return tieneParabrisas;
    }

    public void setTieneParabrisas(boolean tieneParabrisas) {
        this.tieneParabrisas = tieneParabrisas;
    }

    public TipoManillar getManillar() {
        return manillar;
    }

    public void setManillar(TipoManillar manillar) {
        this.manillar = manillar;
    }
    
    
    
}
