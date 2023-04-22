package pl.sdajavapol141.Task08;

public class Task08app {
    public static void main(String[] args) {
        Parcel parcel = Parcel.of(40,40,40,25,false,new MyValidator());
        System.out.println(parcel);

    }
}
