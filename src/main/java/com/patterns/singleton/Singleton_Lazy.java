package com.patterns.singleton;

import java.io.Console;

public class Singleton_Lazy {

    private static Singleton_Lazy Instance;

    public static Singleton_Lazy getInstance(){

        if(Instance == null){
            Instance = new Singleton_Lazy();
            System.out.println("1. It Okay!");
        }else if (Instance != null){
            System.out.println("There is already Singleton_Lazy instance");
        }
        return Instance;
    }

}

class VeryfySingleton_Lazy{
    public static void main(String[] args) {
        Singleton_Lazy singleton_lazy1 = Singleton_Lazy.getInstance();
        Singleton_Lazy singleton_lazy2 = Singleton_Lazy.getInstance();
        Singleton_Lazy singleton_lazy3 = Singleton_Lazy.getInstance();
    }
}
