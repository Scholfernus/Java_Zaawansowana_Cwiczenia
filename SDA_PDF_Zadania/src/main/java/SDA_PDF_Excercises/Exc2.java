package SDA_PDF_Excercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exc2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner numbers = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy: ");
        int n = input.nextInt();
        int[] tab = new int[n];
        System.out.printf("Podaj %d dowolnych liczb całkowitych: ", n);
        for (int i = 0; i < tab.length; i++) {
            tab[i] = numbers.nextInt();
        }
        System.out.println(Arrays.toString(tab));
        for (int i = 0; i < tab.length - 1; i++) {
            for (int j = tab.length - 1; j > 0; j--) {
                if (tab[tab.length-1] < tab[tab.length-2]) {
                    int temp = tab[tab.length-1];
                    tab[tab.length-1] = tab[tab.length-2];
                    tab[tab.length-2] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(tab));
    }
}
