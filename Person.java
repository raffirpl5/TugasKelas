package tugasKelasjava;

public class Person {
    private String name;
    private int age;

    public Person() {
        name = "null";
        age = 0;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void print() {
        System.out.println("Name: " + name + ",\n Age: " + age);
    }
    
}
