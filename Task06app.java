package pl.sdajavapol141.Task06;

import pl.sdajavapol141.Task01.Book;
import pl.sdajavapol141.Task01.Point;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

public class Task06app {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("R", 2);
        map.put("A", 5);
        map.put("B", 3);
        Map.Entry<String, Integer> firstEntry = map.firstEntry();
        Map.Entry<String, Integer> lastEntry = map.lastEntry();
        printEntries(map);
        TreeMap<Point,Double> points = new TreeMap<>();
        points.put(new Point(2,7), 5.4);
        points.put(new Point(8,1), 4.0);
        points.put(new Point(3,10), 7.2);
        printEntries(points);
        TreeMap<Book,Long> books = new TreeMap<>((a,b)->a.getCopies()- b.getCopies());
        books.put(Book.builder().copies(3).build(), 6L);
        books.put(Book.builder().copies(9).build(), 16L);
        books.put(Book.builder().copies(2).build(), 65L);
        printEntries(books);
        TreeMap<LocalDate,String>calendar = new TreeMap<>((a,b)->b.compareTo(a)); // odwrócone od najstarszej do najmłodszej
        calendar.put(LocalDate.of(2023,4,20)," Birthday");
        calendar.put(LocalDate.of(2023,4,17)," Shopping");
        calendar.put(LocalDate.of(2023,4,25)," Trip");
        printEntries(calendar);
    }
    public static void printEntries(TreeMap<?,?> treeMapr){
        System.out.println(treeMapr.firstEntry());
        System.out.println(treeMapr.lastEntry());
    }

}
