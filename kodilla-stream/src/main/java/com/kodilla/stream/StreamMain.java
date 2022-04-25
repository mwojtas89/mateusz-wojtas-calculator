package com.kodilla.stream;


import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.Processor;

public class StreamMain {

    public static void main(String[] args) {
        Processor processor = new Processor();
        Executor codeToExecute = () -> System.out.println("This is an example text.");
        processor.execute(codeToExecute);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String txt = "abc";
        PoemDecorator toUpperCase = (String) -> txt.toUpperCase();
        PoemDecorator toLoverCase = (String) -> txt.toLowerCase();
        PoemDecorator replace = (String) -> txt.replace("b", "t");
        poemBeautifier.beautify(txt, toUpperCase);
        poemBeautifier.beautify(txt, toLoverCase);
        poemBeautifier.beautify(txt, replace);

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

    }
}