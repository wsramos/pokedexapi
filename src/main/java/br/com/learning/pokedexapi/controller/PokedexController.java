package br.com.learning.pokedexapi.controller;

import br.com.learning.pokedexapi.model.entities.Pokemon;
import br.com.learning.pokedexapi.view.services.PokedexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pokedex")
public class PokedexController {

    @Autowired
    private PokedexService pokedexService;

    @GetMapping
    public ResponseEntity<List<Pokemon>> getAllPokemons() {
        try {
            List<Pokemon> pokemonList = pokedexService.listPokemons();

            if (pokemonList.isEmpty()) {
                return ResponseEntity.noContent().build();
            } else {
                return ResponseEntity.ok(pokemonList);
            }
        } catch (Exception e) {
            return ResponseEntity.status(500).build();
        }
    }

    //Todo: Implementar o end-point de salvar um novo pokemon

}
