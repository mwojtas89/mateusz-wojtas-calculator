package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class StreamMovies {

    public static void main(String[] args) {
        MovieStore movies = new MovieStore();

        String print = movies.getMovies().entrySet().stream()
                .flatMap(tl->tl.getValue().stream())
                .collect(Collectors.joining("!"));
        System.out.println(print);
    }
}
