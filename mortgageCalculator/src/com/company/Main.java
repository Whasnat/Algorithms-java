package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Principal Amount: ");
        int amount = input.nextInt();
        System.out.println("Enter Interest rate: ");
        double rate = input.nextDouble();
        System.out.println("Enter Period (Years): ");
        int period = input.nextInt();

        double mortgage = calculateMortgage(amount, rate, period);
        String totalPayable = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println("Mortgage: " + totalPayable);

        System.out.println("Math.Pow: "+Math.pow(5,2));
    }

    private static double calculateMortgage(int amount, double interestRate, int period) {
        double r = (interestRate / 100); // interest rate
        int n = (period * 12); // number of payments
        return (amount * ((r * Math.pow((1 + r), n)) / (Math.pow((1 + r), n) - 1)));
    }

//    private static void function(){}
}