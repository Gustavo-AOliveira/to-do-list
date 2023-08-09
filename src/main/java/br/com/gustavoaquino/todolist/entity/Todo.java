package br.com.gustavoaquino.todolist.entity;


import br.com.gustavoaquino.todolist.ToDoDTO.AtualizacaoDados;
import br.com.gustavoaquino.todolist.ToDoDTO.CadastroDeDados;
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
    private Integer prioridade;

    public Todo(CadastroDeDados dadosCadastro) {
        this.nome = dadosCadastro.nome();
        this.descricao = dadosCadastro.descricao();
        this.realizado = dadosCadastro.realizado();
        this.prioridade = dadosCadastro.prioridade();
    }

    public void atualizarInformacoes(AtualizacaoDados dadosAtualizacao) {
        if (dadosAtualizacao.nome() != null) {
            this.nome = dadosAtualizacao.nome();
        }
        if (dadosAtualizacao.descricao() != null) {
            this.descricao = dadosAtualizacao.descricao();
        }
        if (dadosAtualizacao.prioridade() != null) {
            this.prioridade = dadosAtualizacao.prioridade();
        }
        if(dadosAtualizacao.realizado()){
            this.realizado = true;
        } else if(this.realizado){
            this.realizado = true;
        }else {
            this.realizado = false;
        }
    }
}



















