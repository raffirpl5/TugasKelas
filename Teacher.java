package tugasKelasjava;

public class Teacher extends Person{
    private String subject;

    public Teacher(){
        super();
        subject = "null";
    }

    public Teacher(String name, int age, String subject){
        super(name, age);
        this.subject = subject;
    }

    public void print(){
        super.print();
        System.out.println("Subject: " + this.subject);

    
    }
}