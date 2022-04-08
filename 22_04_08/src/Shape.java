/*public interface Shape {

    double getArea(); //넓이
    double getPerimeter(); //둘레

    //인터페이스 : 특정 조건을 따르게 하기위한 기본형태
    // 변수 가질수 없음, 메서드 내용 비어있어야함
}*/


public abstract class Shape {

    public abstract double getArea(); //넓이
    public abstract double getPerimeter(); //둘레

    private double x, y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void move(double x, double y){
        this.x += x;
        this.y += y;
    }

    //추상클래스;
    // 추상메서드를 반드시 상속받는 클래스에서 선언을 해줘야함
}