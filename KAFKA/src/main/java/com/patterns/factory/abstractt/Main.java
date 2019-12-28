package com.patterns.factory.abstractt;

public class Main {

    public static void main(String[] args) {

        FactoryProvider factoryProvider = new FactoryProvider();

        FactoryProvider.getFactory("Animal");

      FactoryProvider.getFactory("Dog");

      //Animal animal = FactoryProvider.getFactory("White");

//      animal.getAnimal();
//      animal.makeSound();


    }
}
