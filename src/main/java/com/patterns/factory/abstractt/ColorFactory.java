package java.main.com.patterns.factory.abstractt;

public class ColorFactory implements AbstractFactory<Color> {
    @Override
    public Color create(String color) {
        if("White".equalsIgnoreCase(color)){
            return new White();
        }else if ("Gold".equalsIgnoreCase(color)){
            return new Gold();
        }
        return null;
    }
}
