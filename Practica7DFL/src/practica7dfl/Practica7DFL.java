package practica7dfl;

public class Practica7DFL {
    public static void main(String[] args) {
        SistemaBancoDF sistema = new SistemaBancoDF();

        String[] matriculas = {"AB31", "XYZ99"}; // una válida, una inválida
        double[] saldos = {1500.0, 500.0};       // uno suficiente, uno insuficiente
        String[] usuarios = {"6033", "9999"};    // uno existente, uno inexistente

        for (String matricula : matriculas) {
            for (double saldo : saldos) {
                for (String usuario : usuarios) {
                    System.out.println("Probando con: Matricula=" + matricula + ", Saldo=" + saldo + ", Usuario=" + usuario);
                    sistema.procesarOperacion(matricula, saldo, usuario);
                }
            }
        }

        System.out.println("\nConsulta el archivo log_estudiante.txt para ver los resultados de cada operación.");
    }
}
