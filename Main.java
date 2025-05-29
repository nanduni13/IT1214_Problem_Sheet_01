class Student {
    private int studentId;
    private String name;
    private int daysAttended;

    // Constructor
    public Student(int studentId, String name, int daysAttended) {
        this.studentId = studentId;
        this.name = name;
        this.daysAttended = daysAttended;
    }

    // Getters
    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getDaysAttended() {
        return daysAttended;
    }

    // Setters
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDaysAttended(int daysAttended) {
        this.daysAttended = daysAttended;
    }

    // Method 
    public void displayDetails() {
        System.out.println("ID: " + studentId + ", Name: " + name + ", Days Attended: " + daysAttended);
    }
}


class Classroom {
    private Student[] students = new Student[10];
    private int count = 0;

    
    

    
    
}


public class Main {
    public static void main(String[] args) {
        
        Classroom classroom = new Classroom();

        
        
        
        classroom.displayAllStudents();
    }
}
