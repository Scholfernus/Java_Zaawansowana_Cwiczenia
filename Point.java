package pl.sdajavapol141.Task01;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Point implements Comparable<Point>{
    private double x;
    private double y;

    @Override
    public int compareTo(Point point2) {
        if (x==point2.x){
            return Double.compare(y, point2.y);
        }else {
            return Double.compare(x, point2.x);
        }
    }
}
