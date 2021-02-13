package com.company;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        return new int[] {getX(), getY()};
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "MyPoint{" +   //"(" + x + "," + y + ")";
                "x=" + x +
                ", y=" + y +
                '}';
    }

    double distance(int x, int y) {
        return Math.sqrt((this.x - x) * (this.x - x) + ((this.y - y) * (this.y - y)));
    }

    double distance(MyPoint another) {
        return distance(another.getX(), another.getY());
    }

    double distance() {
        return distance(0, 0);
    }
}
