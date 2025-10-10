package practica7dfl;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SistemaBancoDFTest {

    @Test
    public void testMatriculaInvalida() {
        SistemaBancoDF sistema = new SistemaBancoDF();
        assertThrows(Matricula31InvalidaException.class, () -> {
            sistema.validarMatricula("1234");
        });
    }

    @Test
    public void testSaldoInsuficiente() {
        SistemaBancoDF sistema = new SistemaBancoDF();
        assertThrows(SaldoMayoInsuficienteException.class, () -> {
            sistema.verificarSaldo(500);
        });
    }

    @Test
    public void testUsuarioNoEncontrado() {
        SistemaBancoDF sistema = new SistemaBancoDF();
        assertThrows(Usuario6033NoEncontradoException.class, () -> {
            sistema.buscarUsuario("9999");
        });
    }

    @Test
    public void testOperacionExitosa() {
        SistemaBancoDF sistema = new SistemaBancoDF();
        assertDoesNotThrow(() -> {
            sistema.procesarOperacion("AB31", 1500, "6033");
        });
    }
}
