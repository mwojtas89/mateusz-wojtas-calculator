package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BoardTestSuite {

    private String TASK_1 = "abc";
    private String TASK_2 = "abc2";
    private String TASK_3 = "abc3";

    @Autowired
    private Board board;

    @Test
    void testTaskAdd() {
        //Given
        board.getDoneList().getTaskList().add(TASK_1);
        board.getInProgressList().getTaskList().add(TASK_3);
        board.getToDoList().getTaskList().add(TASK_2);
        //When & Then
        String test = board.getDoneList().getTaskList().get(0);
        String test2 = board.getInProgressList().getTaskList().get(0);
        String test3 = board.getToDoList().getTaskList().get(0);
        Assertions.assertEquals(TASK_1, test);
        Assertions.assertEquals(TASK_3, test2);
        Assertions.assertEquals(TASK_2, test3);
    }
}
