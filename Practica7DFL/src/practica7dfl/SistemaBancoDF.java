package practica7dfl;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SistemaBancoDF {
    public void validarMatricula(String matricula) throws Matricula31InvalidaException {
        if (!matricula.endsWith("31")) {
            throw new Matricula31InvalidaException("Matrícula inválida: " + matricula);
        }
    }

    public void verificarSaldo(double saldo) throws SaldoMayoInsuficienteException {
        if (saldo < 1000) {
            throw new SaldoMayoInsuficienteException("Saldo insuficiente: $" + saldo);
        }
    }

    public void buscarUsuario(String id) throws Usuario6033NoEncontradoException {
        if (!id.equals("6033")) {
            throw new Usuario6033NoEncontradoException("Usuario no encontrado: " + id);
        }
    }

    public void procesarOperacion(String matricula, double saldo, String idUsuario) {
        try (BufferedWriter log = new BufferedWriter(new FileWriter("log_estudiante.txt", true))) {
            validarMatricula(matricula);
            verificarSaldo(saldo);
            buscarUsuario(idUsuario);
            log.write("Operación exitosa para estudiante DF\n");
        } catch (ExceptionFloresBase | IOException e) {
            try (BufferedWriter log = new BufferedWriter(new FileWriter("log_estudiante.txt", true))) {
                log.write("Error: " + e.getMessage() + "\n");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
