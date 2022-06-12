package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    List<String> tasks;

    public TaskList(List<String> tasks) {
        this.tasks = new ArrayList<>();
    }

    public void add(String abc) {
        tasks.add(abc);
    }
    public void print() {
        System.out.println(tasks);
    }
}
