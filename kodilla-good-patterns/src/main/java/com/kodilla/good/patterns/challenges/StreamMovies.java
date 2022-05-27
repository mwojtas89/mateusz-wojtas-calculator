package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMovies {

    public static void main(String[] args) {
        MovieStore movies = new MovieStore();
        List<String> print = movies.getMovies().entrySet().stream()
                .flatMap(tl->tl.getValue().stream())
                .collect(Collectors.toList());
        String out = "";
        for(String pr : print){
            out = out + pr + "!";
        }
        System.out.println(out);
    }



}
