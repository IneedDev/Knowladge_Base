package com.patterns.strategy;

public class FormatExample {

    private String format;

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String format(String text){

        if(format.equals("upperCase")){
            return text.toUpperCase();
        }else if (format.equals("lowerCase")){
            return text.toLowerCase();
        }else if (format.equals("capitalize")){
            return text.substring(0,1).toUpperCase()+text.substring(1).toLowerCase();
        }
        return text;
    }
}
