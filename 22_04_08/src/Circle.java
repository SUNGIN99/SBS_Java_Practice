public class Circle implements Shape{
    // Shape 에 있는 메서드를 오버라이딩해주지 않으면 오류

    public static final double PI = Math.PI;
    double radius;

    public Circle(double radius) {
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
