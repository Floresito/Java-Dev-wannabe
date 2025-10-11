package practica5dfl;

public class RectanguloFlores extends Figura31{
    double base, altura;

    public RectanguloFlores(double base, double altura) {
        super("Rectangulo");
        this.base = base;
        this.altura = altura;
    }

    // Sobrecarga de métodos
    public double calcularArea(double base, double altura) {
        return base * altura;
    }

    public double calcularArea(int lado) {
        return lado * lado; // cuadrado
    }

    public double calcularArea(float base, float altura) {
        return base * altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}
