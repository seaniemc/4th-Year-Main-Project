package com.example.repositories;

import com.example.models.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TodoRepository extends MongoRepository<Todo, String>{

    public List<Todo> findAll();
    public Todo findOne(String id);
    public Todo save(Todo todo);
    public Todo update(Todo todo);
    public void delete (Todo todo);

}
