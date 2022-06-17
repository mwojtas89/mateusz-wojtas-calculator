package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCalculationTestSuite {
    @Test
    void statisticMockTest () {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userList = new ArrayList<>();
        userList.add("Benek");
        userList.add("Tomek");
        userList.add("Michal");
        userList.add("Ania");
        int postsCountMock = 100;
        int commentsCountMock = 350;
        when(statisticsMock.usersNames()).thenReturn(userList);
        when(statisticsMock.postsCount()).thenReturn(postsCountMock);
        when(statisticsMock.commentsCount()).thenReturn(commentsCountMock);
        //When
        StatisticsCalculation statisticsCalculation = new StatisticsCalculation(statisticsMock);
        statisticsCalculation.calculateAdvStatistics();
        statisticsCalculation.printStat();
        //Then
        Assertions.assertEquals(4, statisticsMock.usersNames().size());
        Assertions.assertEquals(100,statisticsMock.postsCount());
        Assertions.assertEquals(350,statisticsMock.commentsCount());
        Assertions.assertEquals(25, statisticsCalculation.getAvragePostToUser());
        Assertions.assertEquals(87, statisticsCalculation.getAvrageCommentToUser());
        Assertions.assertEquals(3,statisticsCalculation.getAvrageComentToPost());
    }
}
