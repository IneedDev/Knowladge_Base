package java.main.com.patterns.strategy;

public class UpperCaseFormatter implements TextFormatStrategy {

    public String format(String text) {
        return text.toUpperCase();
    }
}
