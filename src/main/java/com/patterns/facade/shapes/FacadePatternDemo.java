package java.main.com.patterns.facade.shapes;

public class FacadePatternDemo {

    public static void main(String[] args) {
        // create facade for our system

        ShapeMakerFacade shapeMakerFacade = new ShapeMakerFacade();

        // now we have connection to proper methods without touching them

        shapeMakerFacade.drawCircle();
        shapeMakerFacade.drawRectangle();
        shapeMakerFacade.drawSquare();

        // if we add new class triangle we need correct ShabeMarkerFacace class
    }
}
