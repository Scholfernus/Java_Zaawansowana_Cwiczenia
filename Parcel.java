package pl.sdajavapol141.Task08;

import lombok.*;

@Data
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Parcel {
   private int xLength;
   private int yLength;
   private int zLength;
    float weight;
    boolean isExpress;
    public static Parcel of(int x, int y, int z, float w, boolean e, Validator validator){
        Parcel parcel = new Parcel(x, y, z, w, e);
        if (validator.validate(parcel)){
            return parcel;
        }else {
            throw new IllegalArgumentException();
        }
    }
}
