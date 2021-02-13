package com.company;

public class PointApplication {

    public static void main(String[] args) {

        MyPoint coordinateFirst = new MyPoint(-3, -4); // 3*3 + 4*4 = 5*5
        MyPoint coordinateSecond = new MyPoint(3, 4);

        System.out.println("Values for first coordinate are: ");
        int[] array = coordinateFirst.getXY();
        for(int i: array) {
            System.out.println(i);
        }

        int[] array2 = coordinateSecond.getXY();
        System.out.println("Values for second coordinate x = " + array2[0] + ", y = " + array2[1] + ".");

//        coordinateFirst.setXY(4, 5);
        System.out.println(coordinateFirst.distance(1, 1));

//        System.out.println(coordinateFirst.distance(coordinateSecond.getX(), coordinateSecond.getY()));
        System.out.println(coordinateFirst.distance(coordinateSecond));

        System.out.println(coordinateFirst.distance());
    }
}
