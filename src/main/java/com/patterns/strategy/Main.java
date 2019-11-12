package java.main.com.patterns.strategy;

public class Main {

    public static void main(String[] args) {

        String text = "YOURtextToFormating";

        // old version of formatter
        FormatExample format = new FormatExample();
        format.setFormat("upperCase");
        format.setFormat("lowerCase");
        format.setFormat("capitalize");
        System.out.println(format.format(text));

        // Strategy behaviour pattern
        String textStrategy = "Stratedy Design Pattern";
        FormatterExampleContext formatterExampleContext = new FormatterExampleContext();
        formatterExampleContext.set(new CapitalizeFormatter());
        formatterExampleContext.printProperStrategy(textStrategy);




    }
}
