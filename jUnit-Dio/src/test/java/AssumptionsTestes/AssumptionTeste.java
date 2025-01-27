package AssumptionsTestes;

import org.junit.Test;
import org.junit.jupiter.api.Assumptions;

import static org.junit.Assert.*;

public class AssumptionTeste {

    @Test
    public void validarAlgoSomenteNoUsuarioWillian(){
        Assumptions.assumeFalse("root".equals(System.getenv("USER")));
        assertEquals(10, 5 + 5);
    }
}
