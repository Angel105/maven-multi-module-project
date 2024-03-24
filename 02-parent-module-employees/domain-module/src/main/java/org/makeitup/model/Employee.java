package org.makeitup.model;

import java.util.Random;

public class Employee {

    private int taskId;

    private String name;

    private String message;

    public Employee(String name, String message) {
        this.name = name;
        this.message = message;
        this.taskId = new Random().nextInt(50);
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
