package br.com.gustavoaquino.todolist.controller;

import br.com.gustavoaquino.todolist.ToDoDTO.AtualizacaoDados;
import br.com.gustavoaquino.todolist.ToDoDTO.CadastroDeDados;
import br.com.gustavoaquino.todolist.entity.Todo;
import br.com.gustavoaquino.todolist.service.TodoService;
import jakarta.validation.Valid;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {
    private TodoService todoService;
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }
    @PostMapping
    @Transactional
    public void create(@RequestBody @Valid CadastroDeDados dadosCadastro){
        todoService.create(dadosCadastro);
    }
    @GetMapping
    public List<Todo> list(){
        return todoService.list();
    }
    @PutMapping
    @Transactional
    public void update(@RequestBody @Valid AtualizacaoDados dadosAtualizacao){
        todoService.update(dadosAtualizacao);
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") long id){
        todoService.delete(id);
    }

}












