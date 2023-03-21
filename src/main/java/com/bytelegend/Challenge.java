package com.bytelegend;

import java.lang.Math;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("0 is : " + isOdd(0));
        System.out.println("1 is : " + isOdd(1));
        System.out.println("2 is : " + isOdd(2));
        System.out.println("-3 is : " + isOdd(-3));
    }

    /**
     * `isOdd()` checks if an integer is odd. Return string `"odd"` if it's odd, string `"even"`
     * otherwise.
     */
    public static String isOdd(int n) {
        return (n % 2 == 0) ? "even" : "odd";
    }
}