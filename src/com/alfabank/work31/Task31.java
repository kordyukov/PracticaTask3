package com.alfabank.work31;

public class Task31 {

    public static void main(String[] args) {
	double w = 100.0;
	double newW = w * 453.6;
	int kg = (int)(newW/1000);
        System.out.println("Kg->"+ kg);
        int gr = (int)(newW % 1000);
        System.out.println("Gr->"+ gr);
    }
}
