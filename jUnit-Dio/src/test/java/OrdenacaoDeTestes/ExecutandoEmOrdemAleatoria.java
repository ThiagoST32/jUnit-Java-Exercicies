package OrdenacaoDeTestes;

import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.Assert.*;

@TestMethodOrder(MethodOrderer.Random.class)
public class ExecutandoEmOrdemAleatoria {

    @Test
    public void validarFluxoA() {
        assertTrue(true);
    }

    @Test
    public void validarFluxoB() {
        assertTrue(true);
    }

    @Test
    public void validarFluxoC() {
        assertTrue(true);
    }

    @Test
    public void validarFluxoD() {
        assertTrue(true);
    }

    @Test
    public void validarFluxoE() {
        assertTrue(true);
    }
}
