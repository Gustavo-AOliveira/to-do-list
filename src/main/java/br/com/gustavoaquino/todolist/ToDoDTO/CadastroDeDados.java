package br.com.gustavoaquino.todolist.ToDoDTO;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record CadastroDeDados(
        @NotBlank
        String nome,
        @NotBlank
        String descricao,
        boolean realizado,
        @Min(value = 1)
        @Max(value = 10)
        Integer prioridade
) {
}
