package com.company;

import java.util.Scanner;

public class Main {

    private static double balance = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean i = true;
        while (i){
            System.out.println("Type 'Q' to exit\n" +
                    "'T' to make a transaction\n" +
                    "or 'B' to check balance");
            switch (scanner.nextLine()){
                case "T": case "t":
                    System.out.println("Enter value to add to account:");
                    activity(scanner.nextDouble());
                    scanner.nextLine();
                    break;
                case "B": case "b":
                    System.out.println("Your balance is equal to " + balance);
                    break;
                case "Q": case "q":
                    i = false;
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }
        }

    }

    public static void activity(double value){
        balance += value;
        if (value > 0) System.out.println("You have deposited " + value + " in your account");
        if (value == 0) System.out.println("Action canceled");
        if (value < 0) System.out.println("You have withdrawn " + (-value) + " from your account");
    }

}
