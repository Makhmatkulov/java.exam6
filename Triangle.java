public class Triangle {
    public double sideA;
    public double sideB;
    public double sideC;

    public double perimeter(double sideA, double sideB, double sideC) {
        return sideA + sideB + sideC;
    }
    public double area(double sideA, double sideB, double sideC) {
        return Math.sqrt((sideA + sideB + sideC) / 2 * ((sideA + sideB + sideC) / 2 - sideA) * ((sideA + sideB + sideC) / 2 - sideB) * ((sideA + sideB + sideC) / 2 - sideC));
    }
}
