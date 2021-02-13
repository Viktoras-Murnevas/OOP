
public class Square {

    private double length;
    private double width;

    double area() {
        return length * width;
    }


    double perimeter() {
        return length * 2 + width * 2;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public Square() {}

    public Square(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

}


