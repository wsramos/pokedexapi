package br.com.learning.pokedexapi.view.services;

import br.com.learning.pokedexapi.model.entities.Pokemon;
import br.com.learning.pokedexapi.model.repositories.PokedexRepositorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokedexService {

    @Autowired
    private PokedexRepositorie pokedexRepositorie;

    public List<Pokemon> listPokemons() {
        return pokedexRepositorie.findAll();
    }

    //Todo: Implementar o método de salvar um novo pokemon

    //Todo: Implementar o método de deletar um pokemon

    //Todo: Implementar o método de atualizar um pokemon
}
