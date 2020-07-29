package com.practise.todos.todos.repository;

import java.util.Optional;

import com.practise.todos.todos.entities.Todo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
/*import org.springframework.data.repository.Jpa; */

public interface TodoRepository extends JpaRepository<Todo, Long>{

    /**@Override
    Optional<Todo> findById(Long long); */

    @Override
    Page<Todo> findAll(Pageable pageable);

	Optional<Todo> findById(long id);
    
}