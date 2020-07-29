package com.practise.todos.todos.exceptions;

import java.util.function.Supplier;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException implements Supplier<NotFoundException> {
    
    public NotFoundException(String message) { super(message);}

    @Override
    public NotFoundException get() {return null;}
}