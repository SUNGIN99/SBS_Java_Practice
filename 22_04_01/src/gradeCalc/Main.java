package gradeCalc;

public class Main {

    public static void main(String[] args) {
        GradeCalculator kim = new GradeCalculator("김성인", 4.0, 100);

        kim.addCourse(new Course("객체지향프로그래밍",Course.CREDIT_MAJOR, "A+"));
        kim.addCourse(new Course("신호시스템", Course.CREDIT_MAJOR, "A"));
        kim.addCourse(new Course("해석학", Course.CREDIT_MAJOR, "B+"));
        kim.addCourse(new Course("확률", Course.CREDIT_MAJOR, "A+"));
        kim.addCourse(new Course("스포츠댄스", Course.CREDIT_GENERAL, "A"));

        kim.print();
    }




}
