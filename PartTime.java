package tugasKelasjava;

public class PartTime extends Teacher {
    private int hours;
    private int salary;

    public PartTime(int hours, int salary) {
        super();
        hours = 0;
        salary = 0;
    }
    public PartTime(String name, int age, String subject, int hours, int salary) {
        super(name, age, subject);
        this.hours = hours;
        this.salary = salary;
    }
    public void print() {
        super.print();
        System.out.println("Hours: " + hours);
        System.out.println("Salary: " + salary);
        System.out.println("Total Salary" + hours * salary);    


    
    }
}