package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class BoardConfig {
    @Bean
    public TaskList toDoList(List<String> task) {
        return new TaskList(task);
    }
    @Bean
    public TaskList inProgressList (List<String> task) {
        return new TaskList(task);
    }
    @Bean
    public TaskList doneList (List<String> task) {
        return new TaskList(task);
    }
    @Bean
    public Board board(List<String> task) {
        return new Board(toDoList(task), inProgressList(task), doneList(task));
    }

}
