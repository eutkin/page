package com.github.eutkin.page.controller;

import com.github.eutkin.page.entity.Todo;
import com.github.eutkin.page.repository.TodoRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    private final TodoRepository repository;

    public TodoController(@NonNull TodoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    Page<Todo> findAll(Pageable pageable)  {
        return this.repository.findAll(pageable);
    }
}
