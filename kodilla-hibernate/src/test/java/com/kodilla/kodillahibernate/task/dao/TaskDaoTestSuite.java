package com.kodilla.kodillahibernate.task.dao;

import com.kodilla.kodillahibernate.task.Task;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
public class TaskDaoTestSuite {
    @Autowired
    private TaskDao taskDao;
    private static final String DESCRIPTION =  "Test. Hibernate lessons";

    @Test
    void testTaskDaoSave () {
        //Given
        Task task = new Task(DESCRIPTION,7);

        //When
        taskDao.save(task);

        //Then
        int ID = task.getId();
        Optional<Task> reedTask = taskDao.findById(ID);
        Assertions.assertTrue(reedTask.isPresent());

        //Clean Up
        taskDao.deleteById(ID);

    }
}
