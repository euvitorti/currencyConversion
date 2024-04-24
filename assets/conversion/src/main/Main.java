package main;

import api.Connection;

import java.io.Console;
import java.lang.ref.Cleaner;
import java.util.Scanner;

public class Main {

    public static void conectar(String one, String two) {
        Connection connection = new Connection(one, two);
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
                    [4] EUR -> Dollar
                    [5] EUR -> Argentine currency
                    [6] EUR -> BRL
                    [7] Exit
                    """);

            byte choice = scanner.nextByte();

            if (choice == 7) {
                break;
            }

            switch (choice) {
                case 1:
                    conectar("USD", "ARS");
                    break;
                case 2:
                    conectar("USD", "COP");
                    break;
                case 3:
                    conectar("USD", "BRL");
                    break;
                case 4:
                    conectar("EUR", "USD");
                    break;
                case 5:
                    conectar("EUR", "ARS ");
                    break;
                case 6:
                    conectar("EUR", "BRL");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
}