package PessoaTestes;

import com.dio.dioProjects_BootCamp.Pessoa;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDateTime;

public class PessoaTest {

    @Test
    public void deveCalcularIdadeCorretamente(){
        Pessoa pessoa = new Pessoa();
        pessoa.setIdade(LocalDateTime.of(2000, 1, 1, 15, 0 ,0));
        Assertions.assertEquals(25, pessoa.getIdade());
    }

    @Test
    public void deveRetornarSeEhMaiorDeIdade(){
        Pessoa pessoa = new Pessoa();
        pessoa.setIdade(LocalDateTime.of(2000, 1, 1, 15, 0 ,0));
        Assertions.assertTrue(pessoa.ehMaiorDeIdade());
    }
}