package org.example.Zadania_Zaawansowana;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {
//Napisz program, który odbiera rozmiar tablicy (n) od użytkownika (System.in). Następnie odbierz n liczb od użytkownika
// i umieść je w tablicy. Zaimplementuj algorytm sortowania bąbelkowego, aby posortować tę tablicę w porządku rosnącym.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of Array ");
        int n = scanner.nextInt();
        int numbers[] = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            //  numbers[i] = (int)Math.random()*100;
            numbers[i] = random.nextInt(101);
        }
        int temp = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.print(Arrays.toString(numbers));
    }
}
