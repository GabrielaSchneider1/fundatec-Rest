package br.com.fundatec.carro.service;

import br.com.fundatec.carro.model.Carro;
import br.com.fundatec.carro.repository.CarroRepository;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
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

    public Carro incluir(Carro carro){
        if (carro.getDataModelo().isBefore(carro.getDataFabricacao())) {

            throw new RuntimeException("Data de fabricação deve ser menor que data do modelo");
        }
        return carroRepository.incluir(carro);
    }
}
