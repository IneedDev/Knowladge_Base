package com.patterns.adapter;

public class Client {

    public static void main(String[] args) {
        Bird duck = new Duck();
        duck.makeSound();

        Duck duck1 = new Duck();
        duck1.makeSound();

        Bird toBird = new BirdAdapter(new WinnieThePenguin());
        toBird.makeSound();
    }
}
