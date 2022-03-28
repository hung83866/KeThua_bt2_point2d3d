package com.company;

public class Main {

    public static void main(String[] args) {
	// Kiem thu 2 tham so:
        Point2D point2D = new Point2D();
        point2D.setX(14.4f);
        point2D.setY(2.5f);
        for (float e1: point2D.getXY()) {
            System.out.println(e1);
        }
        System.out.println(point2D);
        Point2D point2D1 = new Point2D(13.4f,233.45f);
        for (float e2: point2D1.getXY()) {
            System.out.println(e2);
        }
        System.out.println(point2D1);
// kiểm thử 3 tham số:
        Point3D point3D = new Point3D();
        point3D.setXYZ(-1.4f,32.5f,4f);
        System.out.println(point3D);
        for (float e3: point3D.getXYZ()) {
            System.out.println(e3);
        }
    }
}


