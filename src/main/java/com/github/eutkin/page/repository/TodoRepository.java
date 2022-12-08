package com.github.eutkin.page.repository;

import com.github.eutkin.page.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Integer> {
}
