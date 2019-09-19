package com.patterns.facade.shapes;

public class ShapeMakerFacade {

    private ShapeSubSystem circle;
    private ShapeSubSystem rectangle;
    private ShapeSubSystem square;

    //with Instance of Shapemaker we need provide objects for particular classes

    public ShapeMakerFacade() {
        this.circle = new Circle();
        this.square = new Square();
        this.rectangle = new Rectangle();
    }

    public void drawCircle(){
        this.circle.draw();
    }
    public void drawRectangle(){
        this.rectangle.draw();
    }
    public void drawSquare(){
        this.square.draw();
    }

}
