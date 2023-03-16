package org.example.Zadania_Zaawansowana;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
//Odwróć liczbę za pomocą pętli while. Program poprosi użytkownika o wprowadzenie numeru, a następnie odwróci liczbę za
//pomocą pętli while, najlepiej podać liczbę dwucyfrową
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int reverseNumber = 0;
        System.out.println("Enter a number between 1 to 10000000 and press Enter");
        number = scanner.nextInt();
        while (number != 0) {
            reverseNumber = reverseNumber * 10;
            reverseNumber = reverseNumber + number % 10;
            number = number / 10;
        }
        System.out.println("Reverse of imput number is: " + reverseNumber);
    }
}
