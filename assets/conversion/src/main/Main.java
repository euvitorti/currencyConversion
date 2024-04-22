package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Welcome! To the currency converter!");
            System.out.println("-----------------------------------");
            System.out.println("""
                        [1] Dollar -> Argentine currency
                        [2] Dollar -> Colombian currency
                        [3] Dollar -> Real
                        [4] Real -> Dollar
                        [5] Argentine currency -> Dollar
                        [6] Colombian currency -> Dollar
                        [7] Exit
                    """);

            byte choice = scanner.nextByte();

            switch (choice) {
                case 1:

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
}