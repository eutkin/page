package com.github.eutkin.page;

import com.github.eutkin.page.entity.Todo;
import com.github.eutkin.page.repository.TodoRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.lang.NonNull;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootApplication
public class PageApplication implements ApplicationRunner {

    public PageApplication(@NonNull TodoRepository repository) {
        this.repository = repository;
    }

    public static void main(String[] args) {
        SpringApplication.run(PageApplication.class, args);
    }

    private final TodoRepository repository;

    @Override
    @Transactional
    public void run(ApplicationArguments args) throws Exception {
        this.repository.saveAll(List.of(new Todo(1), new Todo(2)));
    }
}
