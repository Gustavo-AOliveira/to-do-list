package br.com.gustavoaquino.todolist.ToDoDTO;


import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public record AtualizacaoDados(
        @NotNull
        Long id,
        String nome,
        String descricao,
        boolean realizado,
        @Min(value = 1)
        @Max(value = 10)
        Integer prioridade
) {
}
