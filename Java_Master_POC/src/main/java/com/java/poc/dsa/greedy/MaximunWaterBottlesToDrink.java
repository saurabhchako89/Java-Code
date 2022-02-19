package com.java.poc.dsa.greedy;

public class MaximunWaterBottlesToDrink {
    public static void main(String[] args) {
        int numBottles = 3;
        int numExchange = 4;
        System.out.println("Number of water bottles which you can drink : "+numWaterBottles(numBottles,numExchange));
    }

    public static int numWaterBottles(int numBottles, int numExchange) {
        int drink = numBottles;
        int numFull;

        while(numBottles >= numExchange) {
            numFull = numBottles/numExchange;
            drink = drink+ numFull;
            numBottles = numFull+(numBottles%numExchange);
        }
        return drink;
    }
}
