package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        double sum = returnSum(5, 9.23);
        System.out.println("The final value is: " + sum);
    }

    private static double returnSum(int x,double y){
        return (x+y);
    }
}