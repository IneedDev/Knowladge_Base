package main.java.com.tests;

import java.util.Random;

public class Testing {

    public int addInteger (int x, int y){
        System.out.println(x+y);
        return x+y;
    }

    public boolean checkRange(int rangeMin, int rangeMax, int number){
        if (number>=rangeMin && number<=rangeMax){
            return true;
        }else return false;
    }

    public int feedCheckRangeTestMethod(){
        Random random = new Random();
        return random.nextInt(10);
    }
}
