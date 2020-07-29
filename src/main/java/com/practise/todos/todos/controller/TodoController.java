package com.practise.todos.todos.controller;

import java.net.URI;
import java.util.List;

import com.practise.todos.todos.dto.Message;
import com.practise.todos.todos.dto.TodoDto;
import com.practise.todos.todos.entities.Todo;
import com.practise.todos.todos.model.TodoListResponse;
import com.practise.todos.todos.service.TodoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import lombok.extern.slf4j.Slf4j;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@Slf4j
@RequestMapping("/users")
public class TodoController {
    
    @Autowired
    private TodoService todoService;

    @GetMapping("/todos/{page}")
    public TodoListResponse findAll(@PathVariable("page") int page) {

        return todoService.findAllTodos(page);
    }
    /**public List<TodoDto> getAllTodos(@PathVariable String username, @PathVariable("page") int page) {
        return todoService.findAllTodos();
        
    }*/
    @GetMapping("/{username}/todos/{id}")
    public Todo getTodoById(@PathVariable String username, @PathVariable Integer id) {
        return todoService.findTodo(id);
        
    }

    @PostMapping("/create/todo")
    public ResponseEntity<Message> createTodo(@RequestBody TodoDto todoDto){
          
        return todoService.createTodo(todoDto);
        /**TodoDto createdTodo = todoService.save(todo);
          URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
            .path("/{id}").buildAndExpand(createdTodo.getId()).toUri();
          return ResponseEntity.created(uri).build(); */
    }

    /**@PutMapping("/{username}/todos/{id}")
    public ResponseEntity<TodoDto> updateTodo(@PathVariable String username, @PathVariable long id, @RequestBody TodoDto todo){
          TodoDto todoUpdated = todoService.save(todo);
          return new ResponseEntity<TodoDto>(todo, HttpStatus.OK);
    } */

    @DeleteMapping("/{username}/todos/{id}")
    public Todo deleteTodo(@PathVariable String username, @PathVariable Integer id){

        return todoService.deleteTodo(id);
        /**TodoDto todo = todoService.deleteById(id);
        String Successmsg = "Todo deleted Successfully";
        String FailMsg = "An error occured during processing your request";
        Message message = new Message();
        if(todo!=null){
            return ResponseEntity.noContent().build();
            message.setMessage(Successmsg);
            return new ResponseEntity<>(message, HttpStatus.OK);
        }else{
            return ResponseEntity.notFound().build();
            message.setMessage(FailMsg);
            return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
        }*/
    }
}