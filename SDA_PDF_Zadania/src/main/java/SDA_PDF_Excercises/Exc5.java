package SDA_PDF_Excercises;

import java.util.List;
import java.util.stream.Collectors;

public class Exc5 {
    public List<String>select(List<String>find){
       return find.stream()
               .filter(s->s.startsWith("a"))
               .filter(s->s.length()==3)
               .collect(Collectors.toList());
    }
}
