package br.com.gustavoaquino.todolist.service;

import br.com.gustavoaquino.todolist.DTO.CadastroTodo;
import br.com.gustavoaquino.todolist.DTO.ListagemTodo;
import br.com.gustavoaquino.todolist.entity.Todo;
import br.com.gustavoaquino.todolist.repository.TodoRepository;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class TodoService {
    private TodoRepository todoRepository;
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }
    public List<Todo> create(Todo todo){
        todoRepository.save(todo);
            return list();
    }
    public List<Todo> list(){
        var sort = Sort.by("prioridade").descending().and(Sort.by("nome").ascending());
            return todoRepository.findAll(sort);
    }
    public List<Todo> update(Todo todo){
        todoRepository.save(todo);
            return list();
    }
    public List<Todo> delete(Long id){
        todoRepository.deleteById(id);
            return list();
    }
}











