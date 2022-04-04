package gradeCalc;

public class Course {

    static final int CREDIT_MAJOR = 3;
    static final int CREDIT_GENERAL = 2;

    String subjectName;
    double grade;
    int credit;
    double score;

    public Course(String subjectName, int credit, String grade) {
        this.subjectName = subjectName;
        this.credit = credit;

        switch(grade){
            case "A+" :
                this.grade = 4.5;
                break;
            case "A" :
                this.grade = 4.0;
                break;
            case "B+" :
                this.grade = 3.5;
                break;
            case "B" :
                this.grade = 3.0;
                break;
            case "C+" :
                this.grade = 2.5;
                break;
            case "C" :
                this.grade = 2.0;
                break;
            case "D+" :
                this.grade = 1.5;
                break;
            case "D" :
                this.grade = 1;
                break;
            case "F" :
                this.grade = 0;
                break;
        }


        this.score = (double)this.credit * this.grade;
    }


}
