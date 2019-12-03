package br.com.fundatec.carro.api;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;

public class CarroInputDto {

    @NotBlank(message = "O campo nome é obrigatório")
    private String nome;

    @Pattern(regexp = "^[A-Z]{3}[0-9]{4}$", message = "Placa inválida")
    @NotBlank(message = "O campo placa é obrigatório")
    private String placa;

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

    @Past(message = "Data de fabricação deve ser no passado")
    @NotNull(message = "O campo Data de fabricação é obrigatório")
    private LocalDate dataFabricacao;

    @NotNull(message = "O campo Data do modelo é obrigatório")
    private LocalDate dataModelo;

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
