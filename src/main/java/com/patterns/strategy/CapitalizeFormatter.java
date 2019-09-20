package com.patterns.strategy;

public class CapitalizeFormatter implements TextFormatStrategy {

    public String format(String text) {
        return text.substring(0, 1).toUpperCase() + text.substring(1);
    }
}
