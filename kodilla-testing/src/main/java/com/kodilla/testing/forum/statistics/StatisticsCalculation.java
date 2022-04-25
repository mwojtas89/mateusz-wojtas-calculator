package com.kodilla.testing.forum.statistics;

public class StatisticsCalculation {
    private Statistics statistics;

    public StatisticsCalculation(Statistics statistics) {
        this.statistics = statistics;
    }
    int userQuantity;
    int postQuantity;
    int comentQuantity;
    double avragePostToUser;
    double avrageCommentToUser;
    double avrageComentToPost;

    public void calculateAdvStatistics (Statistics statistics) {


    }
    public void printStat () {
        System.out.println(userQuantity + " " + postQuantity + " " + comentQuantity + " " + avragePostToUser + " " +
                avrageCommentToUser + " " + avrageComentToPost);
    }
}
