package com.dio.dioProjects_BootCamp;

public class Conta {

    private double valor;

    private String numeroConta;

    public Conta() {
    }

    public Conta(double valor, String local) {
        this.valor = valor;
        this.numeroConta = local;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
}
