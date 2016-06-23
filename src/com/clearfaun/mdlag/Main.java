package com.clearfaun.mdlag;

public class Main {

    public static void main(String[] args) {
	// write your code here

        printHello();

        DogFish dogFish = new DogFish();

        dogFish.getNumber();

        System.out.print(dogFish.getNumber());

    }

    private static void printHello(){
        System.out.print("Hello");
    }
}
