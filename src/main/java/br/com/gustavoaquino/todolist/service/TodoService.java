package br.com.gustavoaquino.todolist.service;

import br.com.gustavoaquino.todolist.ToDoDTO.AtualizacaoDados;
import br.com.gustavoaquino.todolist.ToDoDTO.CadastroDeDados;
import br.com.gustavoaquino.todolist.entity.Todo;
import br.com.gustavoaquino.todolist.repository.TodoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class TodoService {
    private TodoRepository todoRepository;
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public void create(CadastroDeDados dadosCadastro){
        todoRepository.save(new Todo(dadosCadastro));
    }
    public List<Todo> list(){
        var sort = Sort.by("prioridade").descending().and(Sort.by("nome").ascending());
            return todoRepository.findAll(sort);
    }
    public void update(AtualizacaoDados dadosAtualizacao){
        var todo = todoRepository.getReferenceById(dadosAtualizacao.id());
        todo.atualizarInformacoes(dadosAtualizacao);

    }
    public void delete(Long id){
        todoRepository.deleteById(id);
    }
}











