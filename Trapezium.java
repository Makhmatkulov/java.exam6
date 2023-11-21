public class Trapezium extends GeometricFigure{
    public double perimeter(double baseA, double baseB, double sideC, double sideD) {
        return baseA + baseB + sideC + sideD;
    }
    public double area(double baseA, double baseB, double high) {
        return baseA * baseB / 2 * high;
    }
}
