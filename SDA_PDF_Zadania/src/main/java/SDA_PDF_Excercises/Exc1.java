package SDA_PDF_Excercises;

import java.util.Scanner;

public class Exc1 {
    public static void main(String[] args) {
        int temporary = 0;
        String reverse = "";
        Scanner givenNumber = new Scanner(System.in);
        System.out.println("Enter some number: ");
        String expectedNumber = givenNumber.nextLine();
        String[] reversedNumber = expectedNumber.split("");
        for (int i = reversedNumber.length - 1; i >= 0; i--) {
            reverse += reversedNumber[i];
        }
        int numb = Integer.parseInt(reverse);
        System.out.println(numb);
        Scanner givenNumber2 = new Scanner(System.in);
        System.out.println("Enter some number: ");
        String expectedNumber2 = givenNumber.nextLine();
        int finalNumber = 0;
        int parseInt = Integer.parseInt(expectedNumber2);
        for (int i = 0; i <= expectedNumber2.length(); i++) {
            temporary = finalNumber + temporary * 10;
            finalNumber = parseInt % 10;
            parseInt = parseInt / 10;
        }

        System.out.println(temporary);

    }
}
