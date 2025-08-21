package com.todoList;

public class Task {
	private String title;
    private boolean isCompleted;
    
    public Task(String title) {
        this.title = title;
        this.isCompleted = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void markCompleted() {
        isCompleted = true;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return (isCompleted ? "[✓] " : "[ ] ") + title;
    }
}
