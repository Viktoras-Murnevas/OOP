
public class Square {

    private double length;
    private double width;
//    private Square[] squares; // negalima, kai viena klase

// Method to calculate    
//    void area()
    double area()
    {
//        double area; //buvo pries tai
//        area = this.length * this.width;
        return length * width;
//        System.out.println("Area of rectangle is : " + area);

    }

// Method to calculate
//    void perimeter()
    double perimeter()
    {
//        double perimeter;
        return length * 2 + width * 2;
//        perimeter = this.length * 2 + this.width * 2;
//        System.out.println("Area of perimeter is : " + perimeter);

    }

// alt+ins > getter: needed in order to use them for loop
    public double getLength() {
        return length;
    }
// alt+ins > getter: needed in order to use them for loop
    public double getWidth() {
        return width;
    }

//1-as constructorius
    public Square() {}

//2-as constructorius
//alt+insert helps to create constructor

    public Square(double length, double width) {
        this.length = length;
        this.width = width;
//        this.squares = squares; // negalima, kai viena klase
    }

//3-ias constructorius
//alt+insert helps to create constructor


//dasidejau is OOP2 1-o tasko
//    @Override
//    static double area() { return length * width; }
//
//    @Override
//    static double perimeter() { return length * 2 + width * 2; }


//alt+insert to String
// padaryti del arrays
    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

}


