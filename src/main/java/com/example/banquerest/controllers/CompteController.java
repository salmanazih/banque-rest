package com.example.banquerest.controllers;

import com.example.banquerest.entities.Compte;
import com.example.banquerest.services.CompteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/comptes")
@CrossOrigin("*")
public class CompteController {

    private final CompteService compteService;

    public CompteController(CompteService compteService) {
        this.compteService = compteService;
    }

    @GetMapping
    public List<Compte> getAllComptes() {
        return compteService.getAllComptes();
    }

    @GetMapping("/{id}")
    public Optional<Compte> getCompteById(@PathVariable Long id) {
        return compteService.getCompteById(id);
    }

    @PostMapping
    public Compte saveCompte(@RequestBody Compte compte) {
        return compteService.saveCompte(compte);
    }

    @DeleteMapping("/{id}")
    public void deleteCompte(@PathVariable Long id) {
        compteService.deleteCompte(id);
    }
}