package br.com.fundatec.carro.service;

import br.com.fundatec.carro.model.Carro;
import br.com.fundatec.carro.repository.CarroRepository;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Service
public class CarroService {

    private final CarroRepository carroRepository;

    public CarroService(CarroRepository carroRepository) {
        this.carroRepository = carroRepository;
    }

    public List<Carro> listarCarros(String nome) {
        return carroRepository.listarCarros(nome);

    }

    public Carro consultar(Long id) {
        return carroRepository.consultar(id);
    }

    public Carro incluir(Carro carro) {
        validar(carro);
        return carroRepository.incluir(carro);
    }

    private void validar(Carro carro) {
        if (carro.getDataFabricacao().isAfter(carro.getDataModelo())) {
            throw new RuntimeException("Data de fabricaçao nao pode " + "ser maior que data do modelo");
        }
        List<String> marcasValidas = Arrays.asList("Fiat", "Ford", "Volkswagen");
        if (!marcasValidas.contains(carro.getMarca())) {
            throw new RuntimeException("A marca " + carro.getMarca() + " é inválida.");
        }
    }

}
