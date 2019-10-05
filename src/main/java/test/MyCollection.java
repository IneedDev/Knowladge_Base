package java.main.spring.test;

public abstract class MyCollection {

    private Object[] myTable = new Object[20];
    private int counter;

    public int size() {
        for (Object object : myTable) {
            counter++;
        }
        return counter;
    }


}
