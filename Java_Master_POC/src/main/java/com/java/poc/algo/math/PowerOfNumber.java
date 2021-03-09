package com.java.poc.algo.math;

public class PowerOfNumber {
  public static void main(String[] args) {
    int x= 10;
    int y = 1;
    power(x,y);
  }

  private static void power(int x, int y){
    int pow = 1;
    while(pow<y){
      pow = pow * x;
    }
     if(pow ==y){
      System.out.println(x+" is a power of "+y);
    }else{
      System.out.println(x+" is not a power of "+y);
    }
  }
}
