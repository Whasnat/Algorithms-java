package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Principal Amount: "); int amount = input.nextInt();
        System.out.println("Enter Interest rate: "); double rate = input.nextDouble();
        System.out.println("Enter Period (Years): "); int period = input.nextInt();

        double mortgage = calculateMortgage(amount, rate ,period);
        String totalPayable = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println("Mortgage: " +totalPayable);
    }

    private static double calculateMortgage(int amount, double interestRate, int period){
        int p = amount;
        double r = (interestRate/100);
        int n = (period*12);
        double mortgage = (p*((r*Math.pow((1+r),n))/(Math.pow((1+r),n)-1)));
        return mortgage;
    }
}