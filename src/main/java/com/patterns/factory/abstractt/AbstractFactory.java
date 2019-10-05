package java.main.com.patterns.factory.abstractt;

public interface AbstractFactory<T> {
    T create(String animalType);
}
