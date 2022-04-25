package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theFroumUserList = new ArrayList<>();

    public Forum () {
        theFroumUserList.add(new ForumUser(1,"Adam", 'M', LocalDate.of(1989,1,8), 10));
        theFroumUserList.add(new ForumUser(2,"Ewa", 'F', LocalDate.of(1991,2,5), 123));
        theFroumUserList.add(new ForumUser(3,"Iza", 'F', LocalDate.of(2001,2,5), 9));
        theFroumUserList.add(new ForumUser(4,"Tomek", 'M', LocalDate.of(2009,2,5), 15));
        theFroumUserList.add(new ForumUser(5,"Albert", 'M', LocalDate.of(2010,2,5), 22));
        theFroumUserList.add(new ForumUser(6,"Mateusz", 'M', LocalDate.of(1970,2,5), 31));
        theFroumUserList.add(new ForumUser(7,"Bartek", 'M', LocalDate.of(2005,2,5), 19));
        theFroumUserList.add(new ForumUser(8,"Kuba", 'M', LocalDate.of(1991,2,5), 200));
    }

    public List<ForumUser> getList () {
        return new ArrayList<>(theFroumUserList);
    }


}
