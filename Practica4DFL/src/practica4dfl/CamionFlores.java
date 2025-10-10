package practica4dfl;

public class CamionFlores extends VehiculoBaseDFL{
    double capacidad_cargaTON;
    int num_ejes;
    boolean tiene_remolque;

    public CamionFlores(double capacidad_cargaTON, int num_ejes, boolean tiene_remolque, String propietario, int anio, double precio_base, Color color, Tipo tipo) {
        super(propietario, anio, precio_base, color, tipo);
        this.capacidad_cargaTON = capacidad_cargaTON;
        this.num_ejes = num_ejes;
        this.tiene_remolque = tiene_remolque;
    }
    
    @Override
    public void mostrarFichaTecnica() {
        super.mostrarFichaTecnica();
        System.out.println("Capacidad de carga: " + capacidad_cargaTON + " toneladas");
        System.out.println("Número de ejes: " + num_ejes);
        System.out.println("Tiene remolque: " + tiene_remolque);
    }

    @Override
    public double calcularImpuesto() {
        return getPrecio_base() * 0.15; // 15% de impuesto para camiones
    }

    @Override
    public String descripcionUso() {
        return "Camión para transporte de carga pesada.";
    }


    public double getCapacidad_cargaTON() {
        return capacidad_cargaTON;
    }

    public void setCapacidad_cargaTON(double capacidad_cargaTON) {
        this.capacidad_cargaTON = capacidad_cargaTON;
    }

    public int getNum_ejes() {
        return num_ejes;
    }

    public void setNum_ejes(int num_ejes) {
        this.num_ejes = num_ejes;
    }

    public boolean isTiene_remolque() {
        return tiene_remolque;
    }

    public void setTiene_remolque(boolean tiene_remolque) {
        this.tiene_remolque = tiene_remolque;
    }
    
    
}
