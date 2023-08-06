package br.com.gustavoaquino.todolist.DTO;

import jakarta.validation.constraints.NotBlank;

public record CadastroTodo(
        @NotBlank
        String nome,
        @NotBlank
        String descricao,
        @NotBlank
        boolean realizado,
        @NotBlank
        int prioridade
) {
}
