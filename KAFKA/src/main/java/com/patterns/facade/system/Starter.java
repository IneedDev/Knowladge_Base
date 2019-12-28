package com.patterns.facade.system;

public class Starter {

    private Facade facade = new Facade();
    private static Starter starter = new Starter();

    public static void main(String[] args) {


    }

    public void StartSystem(){

        facade.connectToDevice();
        printMenu();

    }

    public void printMenu(){

        facade.loginUser();
        facade.sendRequestToDevice();
        facade.confirmUserInSystem();
    }
}
