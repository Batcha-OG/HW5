public class Question {

    private String task;
    private int maxValue;
    private int id;

    public Question(int id, String task, int value){
        this.id = id;
        this.task = task;
        maxValue = value;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public int getId() {
        return id;
    }

    public String getTask() {
        return task;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public void setTask(String task) {
        this.task = task;
    }
}
