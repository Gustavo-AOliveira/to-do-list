package br.com.gustavoaquino.todolist.DTO;

import br.com.gustavoaquino.todolist.entity.Todo;

public record ListagemTodo(String nome, String descricao, boolean realizado, int prioridade) {

    public ListagemTodo(Todo todo) {
        this(todo.getNome(), todo.getDescricao(), todo.isRealizado(), todo.getPrioridade());
    }
}
