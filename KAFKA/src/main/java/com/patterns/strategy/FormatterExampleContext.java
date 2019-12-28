package com.patterns.strategy;

public class FormatterExampleContext {

    // field with interface object

    private TextFormatStrategy strategy;

    public void set(TextFormatStrategy strategy){
        this.strategy = strategy;
    }

    public void printProperStrategy(String text){
        String formattedText = strategy.format(text);
        System.out.println(formattedText);
    }


}
