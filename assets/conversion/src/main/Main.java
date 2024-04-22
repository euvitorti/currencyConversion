package main;

import java.io.Console;
import java.lang.ref.Cleaner;
import java.util.Scanner;

public class Main {

    public static void showQuantity() {
        System.out.println("How much? ");

    }

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

            if (choice == 7) {
                break;
            }

            switch (choice) {
                case 1:
                    showQuantity();
                    break;
                case 2:
                    showQuantity();
                    break;
                case 3:
                    showQuantity();
                    break;
                case 4:
                    showQuantity();
                    break;
                case 5:
                    showQuantity();
                    break;
                case 6:
                    showQuantity();
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
}