package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private List<String> taskList;

    public TaskList() {
        this.taskList = new ArrayList<>();
    }

    public List<String> getTaskList() {
        return taskList;
    }
}
