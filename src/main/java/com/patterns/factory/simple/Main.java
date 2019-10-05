package java.main.com.patterns.factory.simple;

public class Main {

    public static void main(String[] args) {
        // factory instance

        ShapeFactory shapeFactory = new ShapeFactory();

        // get an object

        Shape shape1 = shapeFactory.getShape("Circle");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("Rectangle");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("Square");
        shape3.draw();




    }
}
