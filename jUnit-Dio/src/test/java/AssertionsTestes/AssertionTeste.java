package AssertionsTestes;

import com.dio.dioProjects_BootCamp.Pessoa;
import org.junit.Test;


import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssertionTeste {

    @Test
    public void validarLancamentos() {
        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {10, 2, 3, 4, 5};

        assertArrayEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    public void validarSeObjetoEstaNulo(){
        Pessoa pessoa = null;
        assertNull(pessoa);

        Pessoa pessoa1 = new Pessoa(LocalDateTime.now());
        assertNotNull(pessoa1);
    }

    @Test
    public void validarNumerosDeTiposDiferentes(){
        double valor = 5.0;
        double outroValor = 10.0;

        assertEquals(valor, outroValor);
    }
}
