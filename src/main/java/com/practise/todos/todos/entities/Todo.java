package com.practise.todos.todos.entities;

import lombok.Data;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "todo", schema = "public")
@Data
public class Todo {
    @Id
    /* @GeneratedValue(strategy = GenerationType.IDENTITY) */
    private long id;

	@Column
	private String description;
	@Column
    private String username;
	/**private Date target_date;
    private boolean is_completed;
	public void setDescription(String description) {
	}
	public void setTargetDate(Date targetDate) {
	}
	public void setUsername(String username) {
	}
	public void setIsCompleted(boolean completed) {
	}*/

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

	/**public Date getTargetDate() {
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

}
