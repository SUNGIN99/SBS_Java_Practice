package gradeCalc;

import java.util.ArrayList;

public class GradeCalculator {

    ArrayList<Course> Courses = new ArrayList<>();

    private String name;
    private double pastScore; // 과거 최종학점
    private int pastCredit; // 과거 이수 학점

    private double totalScore; // 전체 학기 학점
    private int totalCredit; // 전체 이수 학점

    private double NowScore = 0; // 이번 학기 학점
    private int NowCredit = 0; // 이번 학기 이수 학점


    public GradeCalculator(String name, double score, int credit) {
        this.name = name;

        this.pastScore = score * credit;
        this.pastCredit = credit;

        this.totalScore = this.pastScore;
        this.totalCredit = this.pastCredit;

    }

    void addCourse(Course course){
        Courses.add(course);

        //course.score = grade * credit => 총점
        totalScore += course.score;
        totalCredit += course.credit;

        NowScore += course.score;
        NowCredit += course.credit;
    }

    void print(){
        System.out.println("직전 학기 성적 : " + pastScore / (double)pastCredit+"("+pastCredit+")");
        System.out.println("이번 학기 성적 : " + NowScore / (double)NowCredit+"("+NowCredit+")");
        System.out.println("전체 예상 성적 : " + totalScore / (double)totalCredit+"("+totalCredit+")");
    }


}
