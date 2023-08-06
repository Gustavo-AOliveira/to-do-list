package br.com.gustavoaquino.todolist.repository;

import br.com.gustavoaquino.todolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
