package ExceptionsTestes;

import com.dio.dioProjects_BootCamp.Conta;
import com.dio.dioProjects_BootCamp.TransferenciaEntreContas;
import org.junit.Test;


import static org.junit.Assert.*;



public class ExceptionsTeste {

    @Test //Testa e lança uma exceção caso haja uma transação menor ou igual a 0
    public void validaCenarioDeExcecaoNaTranferencia(){
       Conta origem =  new Conta(600, "8938405");
       Conta destino = new Conta(200, "9085036");

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        assertThrows(IllegalArgumentException.class, () -> transferenciaEntreContas.tranfere(origem, destino, -1));
    }
}
