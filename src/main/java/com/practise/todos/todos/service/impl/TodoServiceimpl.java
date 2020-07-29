package com.practise.todos.todos.service.impl;

import java.util.List;

import com.practise.todos.todos.dto.Message;
import com.practise.todos.todos.dto.TodoDto;
import com.practise.todos.todos.entities.Todo;
import com.practise.todos.todos.model.TodoListResponse;
import com.practise.todos.todos.repository.TodoRepository;
import com.practise.todos.todos.service.TodoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import  com.practise.todos.todos.exceptions.NotFoundException;

@Service
public class TodoServiceimpl implements TodoService {
    
    @Autowired
    TodoRepository todoRepository;

    @Override
    public ResponseEntity<Message> createTodo(TodoDto todoDto) {
        
        Todo todo = new Todo();
        todo.setId(todoDto.getId());
        todo.setDescription(todoDto.getDescription());
        todo.setUsername(todoDto.getUsername());
        /**todo.setTargetDate(todoDto.getTargetDate());
        todo.setIsCompleted(todoDto.isCompleted()); */

        Todo savedTodo = todoRepository.save(todo);
        String SuccessMsg = "Todo Saved Successfully";
        String FailMsg = "An error occured whilst saving your Todo";
        Message message = new Message();

        if(savedTodo !=null){
            message.setMessage(SuccessMsg);
            return new ResponseEntity<>(message, HttpStatus.OK);
        }
        else{
            message.setMessage(FailMsg);
            return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public TodoListResponse findAllTodos(int page){

        Pageable pageWithTenElements = PageRequest.of(page, 10);
        Page<Todo> optionalTodos = todoRepository.findAll(pageWithTenElements);
        List<Todo> todoList = optionalTodos.getContent();

        TodoListResponse todoListResponse = new TodoListResponse();
        todoListResponse.setCount(todoList.size());
        todoListResponse.setTodos(todoList);
        return todoListResponse;
    }

    public Todo findTodo(int id){
        Todo todo = todoRepository.findById(id).orElse(null);
        if(todo == null){
            throw new NotFoundException("todo with id "+id+"does not exist");
        }
        return todo;
    }


    public Todo deleteTodo(int id){
        Todo todo = todoRepository.findById(id).orElse(null);
        if(todo == null){
            throw new NotFoundException("todo with id "+id+"does not exist");
        }else{
            todoRepository.delete(todo);
            return todo;
        }
    }
}  