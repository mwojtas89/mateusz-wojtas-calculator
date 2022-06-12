package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {
    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        //When

        TaskList toDoList = context.getBean("toDoList",TaskList.class);
        toDoList.tasks.add("abc");
        TaskList inProgressList = context.getBean("inProgressList",TaskList.class);
        inProgressList.tasks.add("abc2");
        TaskList doneList = context.getBean("doneList",TaskList.class);
        doneList.tasks.add("abc3");

        //Then
        toDoList.print();
        inProgressList.print();
        doneList.print();
    }
}
