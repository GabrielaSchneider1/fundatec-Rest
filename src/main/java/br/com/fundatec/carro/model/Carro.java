package br.com.fundatec.carro.model;

import java.time.LocalDate;

public class Carro {
    private Long id;
    private String nome;
    private String placa;
    private LocalDate dataFabricacao;
    private LocalDate dataModelo;

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public LocalDate getDataModelo() {
        return dataModelo;
    }

    public void setDataModelo(LocalDate dataModelo) {
        this.dataModelo = dataModelo;
    }



    public Carro(Long id, String nome, String placa) {
        this.id = id;
        this.nome = nome;
        this.placa = placa;
    }


    public Carro() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
