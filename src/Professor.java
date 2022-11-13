import java.util.ArrayList;

public class Professor extends Employee{


    private ArrayList<Course> course = new ArrayList<Course>();
    private ArrayList<Exam> exam = new ArrayList<Exam>();

    public Professor(Course course){
        this.course.add(course);
    }

    public void addExam(Exam exam){
        this.exam.add(exam);
    }

    public void publicCourse(){

    }

    public void assignTA(){

    }

    public void addCourse(){

    }


}
