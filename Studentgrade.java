class Student {
    private String name;
    private int exam1;
    private int exam2;
    private int exam3;

    // Constructor 
    public Student(String name, int exam1, int exam2, int exam3) {
        

        this.name = name;
        this.exam1 = exam1;
        this.exam2 = exam2;
        this.exam3 = exam3;
    }

    // Validation method
    private void validateScore(int score) {
       
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getExam1() {
        return exam1;
    }

    public int getExam2() {
        return exam2;
    }

    public int getExam3() {
        return exam3;
    }

    // Calculate average
    public double calculateAverage() {
        return (exam1 + exam2 + exam3) / 3.0;
    }
}

public class Studentgrade {
    public static void main(String[] args) {
        
    }
}
