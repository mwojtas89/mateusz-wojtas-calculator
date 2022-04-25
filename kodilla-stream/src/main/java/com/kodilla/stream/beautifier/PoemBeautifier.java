package com.kodilla.stream.beautifier;

public class PoemBeautifier{
    public void beautify (String txt, PoemDecorator poemDecorator) {
        String outPut = poemDecorator.decorate(txt);
        System.out.println("Imput text: " + txt + "Output text : " + outPut);
    }
}
