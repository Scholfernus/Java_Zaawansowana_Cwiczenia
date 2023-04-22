package pl.sdajavapol141.Task01;

import java.util.ArrayList;
import java.util.List;

public class PointApp {
    public static void main(String[] args) {
        List<Point> pointList = new ArrayList<>(List.of(new Point(1, 2), new Point(3, 7), new Point(3, 2)));
//        Point data = new Point((
//                .builder()
//                .x(1.5)
//                .y(2.5)
//                .build(),
//        Point
//                .builder()
//                .x(5.0)
//                .y(2.0)
//                .build(),
//        Point
//                .builder()
//                .x(7.1)
//                .y(12.3)
//                .build(),
//        Point
//                .builder()
//                .x(15.4)
//                .y(25.6)
//                .build(),
//        );
        pointList.stream().sorted().forEach(System.out::println);
    }
}
