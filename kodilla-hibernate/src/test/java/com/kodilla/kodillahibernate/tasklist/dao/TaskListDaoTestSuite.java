package com.kodilla.kodillahibernate.tasklist.dao;

import com.kodilla.kodillahibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String description = "opis1";
    private static final String taskListName = "name";

    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(taskListName,description);

        //When
        taskListDao.save(taskList);

        //Then
        String findByName = taskList.getListName();
        List<TaskList> taskFromDB = taskListDao.findByListName(findByName);
        Assertions.assertEquals(1, taskFromDB.size());

        //Clean Up
        int id = taskList.getID();
        taskListDao.deleteById(id);
    }
}
