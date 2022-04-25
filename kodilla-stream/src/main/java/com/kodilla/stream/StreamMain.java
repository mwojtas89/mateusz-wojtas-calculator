package com.kodilla.stream;


import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.person.People;

public class StreamMain {

    public static void main(String[] args) {
        People.getList().stream()
                .forEach(System.out::println);


        String txt = "abc";
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify(txt, t ->t.toUpperCase());
        poemBeautifier.beautify(txt, t -> t.replace("b","h"));


    }


}