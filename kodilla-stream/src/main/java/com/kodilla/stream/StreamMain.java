package com.kodilla.stream;


import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.person.People;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        People.getList().stream()
                .map(s -> s.toUpperCase())
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(" ")+2) + ".")
                .filter(s -> s.substring(0,1).equals("M"))
                .forEach(System.out::println);


        String txt = "abc";
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify(txt, t ->t.toUpperCase());
        poemBeautifier.beautify(txt, t -> t.replace("b","h"));

        BookDirectory theBookDirectory = new BookDirectory();
        Map<String,Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature , book -> book));

        System.out.println("# elements : " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + " : " + entry.getValue())
                .forEach(System.out::println);

        Forum theForum = new Forum();
        Map<Integer, ForumUser> theResultMapOfUsers = theForum.getList().stream()
                .filter(forumUser -> forumUser.getGender() == 'M')
                .filter(forumUser -> forumUser.getPostQuantity() > 1)
                .filter(forumUser -> (2023 - forumUser.getDateOfBirdth().getYear() > 20))
                .collect(Collectors.toMap(ForumUser::getIdentify, forumUser -> forumUser));

        System.out.println("# Elements of map : " + theResultMapOfUsers.size());
        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + " : " + entry.getValue())
                .forEach(System.out::println);

    }


}