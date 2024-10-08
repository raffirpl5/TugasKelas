package tugasKelasjava;

public class FullTime extends Teacher {
    private int salary;
    public String unit;

    public FullTime() {
        super();
        salary = 0;
        unit = "null";
    }
    public FullTime(String name, int age, String subject, int salary, String unit) {
        super(name, age, subject);
        this.salary = salary;
        this.unit = unit;
    }
    public void print() {
        super.print();
        System.out.println("Salary: " + salary + "\n unit: " + unit);

    }
    
}
