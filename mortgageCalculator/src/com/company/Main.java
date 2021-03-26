package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double totalPayable = calculateMortgage();
        System.out.println("Monthly Payable: " + NumberFormat.getCurrencyInstance().format(totalPayable));
    }

    private static double calculateMortgage(){
        Scanner input = new Scanner(System.in);
        int amount, period;
        float rate;
        while(true){
            System.out.println("Principal ($1K - $1M): ");
            amount = input.nextInt();
            if(1000<=amount && amount<=1_000_000)
                break;
            System.out.println("Value must be between 1,000 and 1,000,000");
        }
        while(true){
            System.out.println("Annual Interest: ");
            rate = input.nextFloat();
            if(rate>0 && rate<=30) {
                rate /= 100;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }
        while(true){
            System.out.println("Period (5 years - 50 years): ");
            period = input.nextInt();
            if(period>=5 && period<=50) {
                period *= 12;
                break;
            }
            System.out.println("Enter a value between 5 and 50");
        }
        return (amount * ((rate * Math.pow((1 + rate), period)) / (Math.pow((1 + rate), period) - 1)));
    } // END of calculateMortgage()
} //End of Main