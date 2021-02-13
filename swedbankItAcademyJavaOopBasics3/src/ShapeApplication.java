import java.awt.geom.Area;
import java.util.Arrays;

public class ShapeApplication {

    public static void main(String[] args) {

        Square square1 = new Square(1,-1);
        Square square2 = new Square(2,2);
        Square square3 = new Square(3,3);

//        Square[] squares = {square, square1, square2, square3};
        Square[] squares = {square1, square2, square3};
//        Square square4 = new Square(4,4);

        System.out.println(square1);
        System.out.println(square2);
        System.out.println(square3);
        System.out.println(squares);
        System.out.println(Arrays.toString(squares));

        for (Square square : squares){
            if (square.getLength() > 0 && square.getWidth() > 0){
                System.out.println("Shape is valid: " + square.getLength() + " " + square.getWidth() + " Area: " + square.area() + " Perimeter: " + square.perimeter() );
            } else {
                System.out.println("Shape is not valid: " + square.getLength() + " " + square.getWidth());
            }
        }

    }
}
