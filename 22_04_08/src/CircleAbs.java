public class CircleAbs extends Shape{

    public static final double PI = Math.PI;
    double radius;

    public CircleAbs(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * PI;
    }

}
