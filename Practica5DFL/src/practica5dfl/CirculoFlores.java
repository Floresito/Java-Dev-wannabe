package practica5dfl;

public class CirculoFlores extends Figura31{
    double radio;

    public CirculoFlores(double radio) {
        super("Circulo");
        this.radio = radio;
    }

    // Sobrecarga de métodos (3 formas de calcular área)
    public double calcularArea(double radio) {
        return Math.PI * radio * radio;
    }

    public double calcularArea(int diametro) {
        return Math.PI * (diametro / 2.0) * (diametro / 2.0);
    }

    public double calcularArea(float radio) {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
