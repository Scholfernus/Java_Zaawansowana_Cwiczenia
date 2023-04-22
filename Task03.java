package pl.sdajavapol141.Task03;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;


public class Task03 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Java", 18);
        map.put("Python", 1);
        map.put("PHP", 0);
        map.put("C#",15);
        map.putIfAbsent("Java", 19);
        printMap(map);
//        for (var item : map.entrySet())
//        {
//            System.out.println("Wartość: " + item.getKey() + ", Wartość: " + item.getValue());
//        }
//        extracted(map);
//        map.entrySet().stream().map(item -> "Klucz " + item.getKey() + ", Wartość: " +
//                + item.getValue()).collect(Collectors.joining("\n"));
    }
//
//    private static void extracted(Map<String, Integer> map) {
//        map.forEach((k, v)-> System.out.println("Klucz: " + k + ", Wartość " + v));
//    }
        private static void printMap(Map<String, Integer> map) {
            String result = map
                    .entrySet()
                    .stream()
                    .map(entry -> "Klucz: " + entry.getKey() + ", Wartość: " + entry.getValue())
                    .collect(Collectors.joining(",\n")) + ".";
            System.out.println(result);
        }
}