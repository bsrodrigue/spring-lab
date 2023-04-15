package com.example.animelib.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.animelib.models.*;

@RestController
public class PokemonController {

  @GetMapping("/pokemon")
  public Pokemon getPokemon(@RequestParam(value = "name", defaultValue = "World") String name) {
    Pokemon pokemon = new Pokemon("Pikachu", 100);

    return pokemon;

  }

}
