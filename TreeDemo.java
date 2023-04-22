package pl.sdajavapol141.Task06;

import java.util.Random;
import java.util.TreeMap;

public class TreeDemo {
    public static void main(String[] args) {
        // Tworzenie drzewa do szybszego sortowania, szukania etc.
        Random random = new Random();
        int count = 10_000_000;
        TreeMap<Integer, Integer> numbers = new TreeMap<>();
        for (int i = 0; i < count; i++) {
            var n = random.nextInt(100_000);
            Integer val = numbers.putIfAbsent(n, 1);
            if (val != null) {
                numbers.put(n, val + 1);
            }
        }
        long start = System.nanoTime();
        boolean containsKey = numbers.containsKey(8);
        long end = System.nanoTime();
        System.out.println("Czy jest 8: " + containsKey);
        System.out.println("Time: " + (end-start));
        numbers.remove(8);
        containsKey = numbers.containsKey(8);
        System.out.println("Czy jest 8: " + containsKey);

    }
}
