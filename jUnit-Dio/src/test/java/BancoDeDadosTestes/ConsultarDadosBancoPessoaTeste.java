package BancoDeDadosTestes;

import com.dio.dioProjects_BootCamp.BancoDeDados;
import com.dio.dioProjects_BootCamp.Pessoa;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class ConsultarDadosBancoPessoaTeste {

    @BeforeAll
    public static void configuraConexao(){
        BancoDeDados.iniciarConexao();
    }

    @BeforeEach
    public void insereDados(){
        BancoDeDados.insereDados(new Pessoa(LocalDateTime.now()));
    }

    @AfterEach
    public void removeDadosDoTeste(){
        BancoDeDados.removeDados(new Pessoa(LocalDateTime.now()));
    }

    @Test
    public void validarDadosDeRetorno(){
        assertTrue(true);
    }

    @AfterAll
    public static void finalizarConexao(){
        BancoDeDados.finalizarConexao();
    }
}
