package br.com.fundatec.carro.repository;

import br.com.fundatec.carro.model.Carro;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class CarroRepository {

    private static List<Carro> listaCarros = null;

    public List<Carro> listarCarros (String nome) {

        List<Carro> listaResultado = new ArrayList<>();

        for (Carro carro : getListaCarros()){
            if(carro.getNome().toLowerCase().contains(nome.toLowerCase())){
                listaResultado.add(carro);
            }
        }

        return listaResultado;
    }

    public Carro consultar(Long id){
        for (Carro carro : getListaCarros()){
            if (carro.getId().equals(id)){
                return carro;
            }
        } return null;
    }


    private List<Carro> getListaCarros(){
        if(listaCarros == null){
            listaCarros = new ArrayList<>();
            listaCarros.add(new Carro(1L, "Celta","MAX1000"));
            listaCarros.add(new Carro ( 2L, "Mustang", "IDD 2555"));
        }
        return listaCarros;
    }



    public Carro incluir(Carro carro) {
        carro.setId(new Long(getListaCarros().size()+ 1));
        listaCarros.add(carro);
        return carro;
    }
}


