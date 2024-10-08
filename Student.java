package tugasKelasjava;

public class Student extends Person {
    private int studentNumber, score;
    private String major;
    
    public Student() {
        super();
        studentNumber = 0;
        score = 0;
        major = "null";
    }
    
    public Student(String name, int age, int studentNumber, int score, String major) {
        super(name, age);
        this.studentNumber = studentNumber;
        this.score = score;
        this.major = major;
    }
    
    public void print() {
        super.print();
        System.out.println("Student Number: " + studentNumber);
        System.out.println("Score: " + score);
        System.out.println("Major: " + major);
    }  
    
}
