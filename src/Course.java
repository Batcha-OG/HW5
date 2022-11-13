import java.util.ArrayList;

public class Course {

    private int id;
    private String name;
    private int maxCapacity;
    private boolean isFull;

    private Professor [] professor = new Professor[2];


    public Course(int id, String name, int cap, Professor prof){

    }

    public void addProfessor(Professor professor){
        for(int i = 0 ; i <= this.professor.length; i++){
            if(this.professor[i] == null){
                this.professor[i] = professor;
                break;
            }
        }
    }

    public void enroll(Student student){

    }

    public void apply(TA ta){

    }

    public void setMaxCap(int max){

    }

    public Professor getProfessor(){

    }

    public TA getTA(){

    }

    public void setTA(TA ta){

    }

    public void setName(String name){

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFull(boolean full) {
        isFull = full;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public boolean isFull() {
        return isFull;
    }
}
