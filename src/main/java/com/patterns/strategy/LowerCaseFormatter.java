package java.main.com.patterns.strategy;

public class LowerCaseFormatter implements TextFormatStrategy {

    public String format(String text) {
        return text.toLowerCase();
    }
}
