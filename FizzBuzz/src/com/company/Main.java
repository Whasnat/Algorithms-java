package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Choice: "); int choice = input.nextInt();
        if(choice%3==0 && choice%5==0)
            System.out.println("Fizz Buzz");
        else{
            if (choice%5==0) {
                System.out.println("Buzz");
                return;
            } else if (choice%3==0){
                System.out.println("Fizz");
                return;
            }
            System.out.println(choice);
        }



    }
}
