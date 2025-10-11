package practica5dfl;

public class TrianguloFlores extends Figura31{
    double base, altura, lado1, lado2, lado3;

    public TrianguloFlores(double base, double altura, double lado1, double lado2, double lado3) {
        super("Triangulo");
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    // Sobrecarga de métodos
    public double calcularArea(double base, double altura) {
        return (base * altura) / 2;
    }

    public double calcularArea(int lado) {
        return (Math.sqrt(3) / 4) * lado * lado; // equilátero
    }

    public double calcularArea(float base, float altura) {
        return (base * altura) / 2;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }
}
