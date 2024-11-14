package br.com.learning.pokedexapi.model.repositories;

import br.com.learning.pokedexapi.model.entities.Pokemon;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokedexRepositorie extends ListCrudRepository<Pokemon, Long> { }
