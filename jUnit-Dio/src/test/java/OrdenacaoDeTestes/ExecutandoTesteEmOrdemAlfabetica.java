package OrdenacaoDeTestes;

import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.Assert.*;

import static org.junit.Assert.assertTrue;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class ExecutandoTesteEmOrdemAlfabetica {
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
