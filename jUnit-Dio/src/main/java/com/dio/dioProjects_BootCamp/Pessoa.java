package com.dio.dioProjects_BootCamp;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    private LocalDateTime idade;

    public Pessoa() {
    }

    public Pessoa(LocalDateTime idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return (int) ChronoUnit.YEARS.between(idade, LocalDateTime.now());
    }

    public void setIdade(LocalDateTime idade) {
        this.idade = idade;
    }

    public boolean ehMaiorDeIdade(){
        return getIdade() >= 18;
    }

}
