package SDA_PDF_Excercises;

import java.util.List;
import java.util.stream.Stream;

public class Exc3 {
    public static void main(String[] args) {

    }
    double average(List<Integer> numbers){
        return numbers.stream().mapToInt(avr->avr).average().getAsDouble();
    }
}
