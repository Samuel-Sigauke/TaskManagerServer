package com.practise.todos.todos.model;

import java.util.List;
import com.practise.todos.todos.entities.Todo;
import lombok.Data;

@Data
public class TodoListResponse {

    private int count;
    private List<Todo> todos;
	public void setCount(int size) {
	}
	public void setTodos(List<Todo> todoList) {
	}
    
}