package SDA_PDF_Excercises;

import java.util.List;
import java.util.stream.Collectors;

public class Exc4 {
    public List<String> toUpper(List<String> letters){
        return letters.stream().map(String::toUpperCase).collect(Collectors.toList());
    }
}
