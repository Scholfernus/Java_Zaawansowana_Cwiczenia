package pl.sdajavapol141.Task01;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Task01App {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Żaneta", "Aneta", "Beata", "Adam", "Robert", "Łukasz"));
        sortPlAscending(names);
        System.out.println(names);
        sortPlDescending(names);
        System.out.println(names);
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};
        BubbleSort.sort(numbers, (a, b) -> a - b);
        System.out.println(Arrays.toString(numbers));
                BubbleSort.sort(numbers, (a, b) -> b - a);
        System.out.println(Arrays.toString(numbers));
        var arrNames = names.toArray();
        BubbleSort.sort(arrNames, Collator.getInstance(Locale.forLanguageTag("pl-PL")));
        System.out.println(names);
    }

    public static List<String> sortPlAscending(List<String> list) {
        var pl = Locale.forLanguageTag("pl-PL");
        var plCollator = Collator.getInstance(pl);
        list.sort(plCollator);
        return list;
    }

    public static List<String> sortPlDescending(List<String> list) {
        var pl = Locale.forLanguageTag("pl-PL");
        var plCollator = Collator.getInstance(pl);
        list.sort(plCollator.reversed());
//        list.sort(a,b) -> -1
        return list;
    }


}
