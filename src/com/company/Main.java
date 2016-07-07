package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Game game = new Game();

        for (int number = 1; number <= 100; number++) {
            System.out.println(Game.fizzBuzz(number));
        }
    }
}
