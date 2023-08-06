package br.com.gustavoaquino.todolist.entity;

import br.com.gustavoaquino.todolist.DTO.CadastroTodo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "todos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private boolean realizado;
    private int prioridade;

    public Todo(CadastroTodo cadastroTodo) {
        this.nome = cadastroTodo.nome();
        this.descricao = cadastroTodo.descricao();
        this.realizado = cadastroTodo.realizado();
        this.prioridade = cadastroTodo.prioridade();
    }
}



















