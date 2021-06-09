package com.alfabank.work33;

public class Task33 {
    public static void main(String[] args) {
        double cost = 830.0;
        double procentMinus = 13;
        double procentPlus = 7;

         //double newCost = cost-(cost*procentMinus/100);
        double newCost = cost *(1-procentMinus/100);

        newCost = newCost * (1*procentPlus/100);
        System.out.println("Coast->"+ newCost);
        System.out.printf("Coast-> %.2f",newCost);

    }
}
