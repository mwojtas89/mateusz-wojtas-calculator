package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int identify;
    private final String userName;
    private final char gender;
    private final LocalDate dateOfBirdth;
    private final int postQuantity;

    public ForumUser(int identify, String userName, char gender, LocalDate dateOfBirdth, int postQuantity) {
        this.identify = identify;
        this.userName = userName;
        this.gender = gender;
        this.dateOfBirdth = dateOfBirdth;
        this.postQuantity = postQuantity;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "identify=" + identify +
                ", userName='" + userName + '\'' +
                ", gender=" + gender +
                ", dateOfBirdth=" + dateOfBirdth +
                ", postQuantity=" + postQuantity +
                '}';
    }

    public int getIdentify() {
        return identify;
    }

    public String getUserName() {
        return userName;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getDateOfBirdth() {
        return dateOfBirdth;
    }

    public int getPostQuantity() {
        return postQuantity;
    }


}
