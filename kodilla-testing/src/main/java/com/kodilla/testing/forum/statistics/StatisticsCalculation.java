package com.kodilla.testing.forum.statistics;

public class StatisticsCalculation {
    private Statistics statistics;

    public StatisticsCalculation(Statistics statistics) {
        this.statistics = statistics;
    }
    private int userQuantity;
    private int postQuantity;
    private int comentQuantity;
    private double avragePostToUser;
    private double avrageCommentToUser;
    private double avrageComentToPost;

    public double getAvragePostToUser() {
        return avragePostToUser;
    }

    public double getAvrageCommentToUser() {
        return avrageCommentToUser;
    }

    public double getAvrageComentToPost() {
        return avrageComentToPost;
    }

    public void calculateAdvStatistics () {
        userQuantity = statistics.usersNames().size();
        postQuantity = statistics.postsCount();
        comentQuantity = statistics.commentsCount();
        avragePostToUser = postQuantity/userQuantity;
        avrageComentToPost = comentQuantity/postQuantity;
        avrageCommentToUser = comentQuantity/userQuantity;
    }
    public void printStat () {
        System.out.println(userQuantity + " " + postQuantity + " " + comentQuantity + " " + avragePostToUser + " " +
                avrageCommentToUser + " " + avrageComentToPost);
    }
}
