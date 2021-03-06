package com.kodilla.patterns.prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TasksList {
    private final String name;
    private final List<Task> tasks = new ArrayList<>();

    @Override
    public String toString() {
        String s = "   List [" + name + "]";
        for (Task task : tasks) {
            s = s + "\n" + task.toString();
        }
        return s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TasksList tasksList = (TasksList) o;
        return name.equals(tasksList.name) && tasks.equals(tasksList.tasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, tasks);
    }

    public String getName() {
        return name;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public TasksList(String name) {
        this.name = name;
    }
}
