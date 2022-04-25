package com.kodilla.testing.forum.statistics;

import java.util.List;

public interface Statistics {
    List<String> usersNames(String userQantyty); // list of users names
    int postsCount(int postQuantyty);          // total quantity of forum posts
    int commentsCount(int commentQantyty);       // total quantity of forum comments
}
