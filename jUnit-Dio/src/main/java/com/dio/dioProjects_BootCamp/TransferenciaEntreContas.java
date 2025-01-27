package com.dio.dioProjects_BootCamp;

public class TransferenciaEntreContas {

    public void tranfere(Conta contaOrigem, Conta destino, double valor){
        if(valor <=0 ){
            throw new IllegalArgumentException("Valor deve ser maior que 0");
        }
    }
}
