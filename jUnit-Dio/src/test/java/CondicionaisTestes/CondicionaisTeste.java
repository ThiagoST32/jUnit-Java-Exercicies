package CondicionaisTestes;

import org.junit.Test;
import org.junit.jupiter.api.condition.*;

import static org.junit.Assert.*;

public class CondicionaisTeste {

    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "root") //Só executa se for root
    public void validarAlgoSomenteNoUsuarioRoot(){
        assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledOnOs(OS.LINUX) //Só executa no LINUX
    public void validarAlgoSomenteNoLinux(){

    }

    @Test
    @EnabledOnOs(OS.MAC) //Só executa no MAC
    public void validarAlgoSomenteNoMac(){

    }

    @Test
    @EnabledOnJre(JRE.JAVA_17) //Só executa no Java version 17
    public void validarAlgoSomenteEmJava17(){

    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_17) //Executa apenas entre as versões de 11 / 17
    public void rodeSomenteNasVersoes11A17(){

    }
}
