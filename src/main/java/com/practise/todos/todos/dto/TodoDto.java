package com.practise.todos.todos.dto;

import java.util.Date;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class TodoDto {

    private long id;
    private String username;
    private String description;
    /**private Date targetDate;
    private boolean isCompleted;

    public TodoDto() {

    }

    public TodoDto(long id,
    @NotNull(message = "Username can not be null") String username,
    @NotNull(message = "Description can not be null") String description,
    @NotNull(message = "Target Date can not be null") Date targetDate,
    @NotNull(message = "Status can not be null") boolean isCompleted) {
        this.id = id;
        this.username = username;
        this.description = description;
        this.targetDate = targetDate;
        this.isCompleted = isCompleted;
    } */

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    } 

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /** public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    } */

    /** @Override
    public String toString() {
        return "TodoDto{" +
        "description='" + description + '\'' +
        ", id='" + id + '\'' +
        ", isCompleted='" + isCompleted + '\'' +
        ", targetDate='" + targetDate + '\'' +
        ", username='" + username + '\'' +
        '}';
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        TodoDto other = (TodoDto) obj;
        if (id != other.id)
            return false;
        return true;
    } */

    
    


}

