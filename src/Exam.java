import java.util.ArrayList;

public class Exam {

    private int maxValue;

    private ArrayList<Question> question = new ArrayList<Question>();
    private ArrayList<Professor> professor = new ArrayList<Professor>();

    public Exam(Question question){
        this.question.add(question);
    }

    public void addProfessor(Professor professor){
        this.professor.add(professor);
    }

    public boolean register(Student student){

    }

    public void addQuestion(Question question){ //attributes (int id, String task, int value) are like question class
        this.question.add(question);
    }

    public Student getRegisteredStudents(){

    }

    public void setMaxValue(int maxValue){
        this.maxValue = maxValue;
    }

    public int getMaxValue() {
        return maxValue;
    }
}
