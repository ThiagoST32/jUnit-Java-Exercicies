package com.dio.dioProjects_BootCamp;

import java.util.logging.Logger;

public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());


    public static void iniciarConexao(){
        LOGGER.info("Inciou conexão!");
    }

    public static void finalizarConexao(){
        LOGGER.info("Finalizando Conexão!!");
    }

    public static void insereDados(Pessoa pessoa){
        //Insere Pessoa no DB
        LOGGER.info("Inseriu dados!!");
    }

    public static void removeDados(Pessoa pessoa){
        //Remove Pessoa DB
        LOGGER.info("Removeu Dados!!");
    }
}
