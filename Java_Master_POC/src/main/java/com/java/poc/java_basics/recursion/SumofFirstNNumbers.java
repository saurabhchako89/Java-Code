package com.java.poc.java_basics.recursion;

public class SumofFirstNNumbers {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        sumofN(n,sum);
    }

    public static void sumofN(int n,int sum){
        if(n == 0){
            return;
        }
        sum += n;
        if(n == 1){
            System.out.println("sum of first "+n+" numbers is : "+sum);
        }

        sumofN(--n,sum);
    }
}
