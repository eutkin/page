package com.github.eutkin.page.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Todo {

    @Id
    private Integer id;

    public Todo(Integer id) {
        this.id = id;
    }

    public Todo() {
    }
}
