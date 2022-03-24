package com.bytelegend;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("0 is odd: " + isOdd(0));
        System.out.println("1 is odd: " + isOdd(1));
        System.out.println("2 is odd: " + isOdd(2));
        System.out.println("-3 is odd: " + isOdd(-3));
    }

    /** `isOdd()` checks if an integer is odd. Return `true` if it's odd, `false` otherwise. */
    public static boolean isOdd(int n) {
        if (n % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}
