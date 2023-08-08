package br.com.gustavoaquino.todolist.controller;

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
    public List<Todo> create(@RequestBody @Valid Todo todo){
        return todoService.create(todo);
    }
    @GetMapping
    public List<Todo> list(){
        return todoService.list();
    }
    @PutMapping
    @Transactional
    public List<Todo> update(@RequestBody @Valid Todo todo){
        return todoService.update(todo);
    }
    @DeleteMapping("{id}")
    public List<Todo> delete(@PathVariable("id") long id){
        return todoService.delete(id);
    }

}












