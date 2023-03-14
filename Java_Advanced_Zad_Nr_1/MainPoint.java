package org.example.Java_Advanced_Zad_Nr_1;

public class MainPoint {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(10,20);
        point2D.setXY(25,40);
        System.out.println(point2D);
        Point3D point3D = new Point3D(5,15,35);
        point3D.setXYZ(10,25,40);
        System.out.println(point3D);
        point2D.getXY();
        System.out.println(point2D);
        point2D.getX();
        System.out.println(point2D);
        System.out.println(point3D.getY());
    }
}
