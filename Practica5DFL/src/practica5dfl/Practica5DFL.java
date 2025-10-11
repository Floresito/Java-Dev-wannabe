package practica5dfl;

public class Practica5DFL {

    public static void main(String[] args) {
        Figura31[] figuras = new Figura31[3];
        figuras[0] = new CirculoFlores(5);
        figuras[1] = new RectanguloFlores(4, 6);
        figuras[2] = new TrianguloFlores(3, 4, 3, 4, 5);

        CalculadoraGeometrica6033 calc = new CalculadoraGeometrica6033();

        for (Figura31 f : figuras) {
            // Uso de polimorfismo
            calc.procesarFigura(f);

            // Uso de instanceof y casting
            if (f instanceof CirculoFlores) {
                CirculoFlores c = (CirculoFlores) f;
                System.out.println("Casting a CirculoFlores -> Radio: " + c.radio);
            } else if (f instanceof RectanguloFlores) {
                RectanguloFlores r = (RectanguloFlores) f;
                System.out.println("Casting a RectanguloFlores -> Base: " + r.base + ", Altura: " + r.altura);
            } else if (f instanceof TrianguloFlores) {
                TrianguloFlores t = (TrianguloFlores) f;
                System.out.println("Casting a TrianguloFlores -> Lados: " + t.lado1 + ", " + t.lado2 + ", " + t.lado3);
            }
            System.out.println("=======================");
        }
    }
    
}
