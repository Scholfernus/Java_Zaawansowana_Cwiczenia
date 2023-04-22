package pl.sdajavapol141.Task06;

import java.util.Arrays;
import java.util.Random;

public class BinarySearchDemo {
    public static void main(String[] args) {


        Random random = new Random();
        int[] arr = new int[10_000_000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000);
        }
        long start = System.nanoTime();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 8){
                System.out.println("8 at " + i);
                break;
            }
        }
        long end = System.nanoTime();
        System.out.println("Wyszukiwanie tradycyjne ...");
        System.out.println("Time: " + (end-start));
        Arrays.sort(arr);
        System.out.println("Wyszukiwanie binarne ...");
        start = System.nanoTime();
        int index8 = Arrays.binarySearch(arr, 8);
        System.out.println("Time: " + (end-start));
        System.out.println(index8);
    }
}
