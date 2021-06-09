package com.alfabank.work32;

public class Task32 {
    public static void main(String[] args) {
       double procent = 10.0;
       int sum = 10000;
       int numberMonth = 6;
       double proMonth = procent / 100 / 12;
       double delta = sum * proMonth * numberMonth;
        System.out.println("Sum->" + delta);
    }
}
