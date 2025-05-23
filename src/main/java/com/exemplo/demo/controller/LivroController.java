package com.exemplo.demo.controller;

import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;

@Tag(name = "Livros", description = "Operações relacionadas a livros")
@RestController
@RequestMapping("/api/livros")
public class LivroController {

    @Operation(summary = "Lista todos os livros")
    @GetMapping
    public String listarLivros() {
        return "Lista de livros";
    }

    @Operation(summary = "Busca um livro por ID")
    @GetMapping("/{id}")
    public String buscarLivro(@PathVariable Long id) {
        return "Livro com ID: " + id;
    }

    @Operation(summary = "Cria um novo livro")
    @PostMapping
    public String criarLivro(@RequestBody String livro) {
        return "Livro criado: " + livro;
    }

    @Operation(summary = "Atualiza um livro existente")
    @PutMapping("/{id}")
    public String atualizarLivro(@PathVariable Long id, @RequestBody String livro) {
        return "Livro atualizado: " + livro;
    }

    @Operation(summary = "Deleta um livro")
    @DeleteMapping("/{id}")
    public String deletarLivro(@PathVariable Long id) {
        return "Livro deletado com ID: " + id;
    }
}
