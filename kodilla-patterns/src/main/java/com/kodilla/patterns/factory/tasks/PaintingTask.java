package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{
    private final String taskName;
    private final String color;
    private final String whatToPrint;
    private boolean executed = false;

    public PaintingTask(String taskName, String color, String whatToPrint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPrint = whatToPrint;
    }

    @Override
    public boolean executeTask() {
        return executed = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return executed;
    }
}
