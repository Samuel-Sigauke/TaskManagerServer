package com.practise.todos.todos.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.practise.todos.todos.dto.Message;
import com.practise.todos.todos.dto.TodoDto;
import com.practise.todos.todos.entities.Todo;
import com.practise.todos.todos.model.TodoListResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

public interface TodoService {

    ResponseEntity<Message> createTodo(TodoDto todoDto);
    TodoListResponse findAllTodos(int page);
    Todo findTodo(int id);
    Todo deleteTodo(int id);
}

/**@Service
public class TodoService {

    private static List<TodoDto> todos = new ArrayList<>();
    private static int idCounter = 0;

    static {
        todos.add(new TodoDto(++idCounter, "Sam", "Rest endpoint", new Date(), false));
        todos.add(new TodoDto(++idCounter, "Sam", "Angular Material", new Date(), false));
        todos.add(new TodoDto(++idCounter, "Sam", "Records App", new Date(), false));
        todos.add(new TodoDto(++idCounter, "Sam", "React WebApp", new Date(), false));
    }
    
    public List<TodoDto> findAll (){
        return todos;
    }
 
    public TodoDto save(TodoDto todo) {
        if(todo.getId()==-1 || todo.getId()==0){
            todo.setId(++idCounter);
            todos.add(todo);
        }else {
            deleteById(todo.getId());
            todos.add(todo);
            
        }
        return todo;
    }

    public TodoDto deleteById(long id) {
        TodoDto todo = findById(id);
        if (todo == null) return null;

        if(todos.remove(todo)){
            return todo;
        }
        return null;
    }

    public TodoDto findById(long id) {
        for(TodoDto todo: todos){
            if(todo.getId() == id){
                return todo;
            }
        }
        return null;
    }


} */