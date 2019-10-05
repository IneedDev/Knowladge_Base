package java.main.com.patterns.factory.abstractt;

public class Dog implements Animal {
    @Override
    public String getAnimal() {
        return "Dog";
    }

    @Override
    public String makeSound() {
        return "BowBow";
    }
}
