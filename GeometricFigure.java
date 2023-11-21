import java.util.Scanner;
public class GeometricFigure {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Triangle triangle = new Triangle();
        Trapezium trapezium = new Trapezium();
        Rectangle rectangle = new Rectangle();
        System.out.println("Uzburchag perimetri: " + triangle.perimeter(3,4,5));
        System.out.println("Uzburchag yuzi: " + triangle.area(3,4,5));
        System.out.println("Trapetsiya perimetri: " + trapezium.perimeter(5,6,4,5));
        System.out.println("Trapetsiya yuzi: " + trapezium.area(5,6,4));
        System.out.println("Kvadrat perimetri: " + rectangle.perimeter(5));
        System.out.println("Kvadrat yuzi: " + rectangle.area(5));


    }
}