package OrdenacaoDeTestes;

import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.Assert.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EscolhendoAOrdemTeste {

    @Order(5)
    @Test
    public void validarFluxoA() {
        assertTrue(true);
    }

    @Order(4)
    @Test
    public void validarFluxoB() {
        assertTrue(true);
    }

    @Order(3)
    @Test
    public void validarFluxoC() {
        assertTrue(true);
    }

    @Order(2)
    @Test
    public void validarFluxoD() {
        assertTrue(true);
    }

    @Order(1)
    @Test
    public void validarFluxoE() {
        assertTrue(true);
    }
}
