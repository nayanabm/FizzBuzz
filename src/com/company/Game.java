package com.company;

/**
 * Created by Nayana on 7/6/2016.
 */
public class Game {

    public static String fizzBuzz(int number) {

        if(checkIfDivisible(number,3)&&checkIfDivisible(number,5))
            return "FizzBuzz";
        else if(checkIfDivisible(number,3))
            return "Fizz";
        else if(checkIfDivisible(number,5))
            return "Buzz";
        else
            return String.valueOf(number);
    }

    private static boolean checkIfDivisible(int number,int divisor) {
        if(number%divisor==0)
            return true;
        return false;
    }

}
