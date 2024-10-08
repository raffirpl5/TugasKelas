package tugasKelasjava;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int salary = 20000;

        System.out.println("Choose one : ");
        System.out.println("1. Student\n2. Teacher");
        String pilihan = input.nextLine();

        if (pilihan.equals("1")) {
        System.out.println("Student Details : ");
        System.out.println("Name :");
        String name = input.nextLine();
        System.out.println("Major : ");
        String major = input.nextLine();
        System.out.println("Age : ");
        int age = input.nextInt();
        System.out.println("Student Number : ");
        int studentNumber = input.nextInt();
        System.out.println("Score : ");
        int score = input.nextInt();
        Student s = new Student(name, age, studentNumber, score, major);
        s.print();
        }else if (pilihan.equals("2")) {
            System.out.println("Choose one :");
            System.out.println("1. PartTime\n2. FullTime");
            String pilihan2 = input.nextLine();
            if (pilihan2.equals("1")) {
                System.out.println("PartTime Details : ");
                System.out.println("Name :");
                String name = input.nextLine();
                System.out.println("Subject : ");
                String subject = input.nextLine();
                System.out.println("Age : ");
                int age = input.nextInt();
                input .nextLine();
                System.out.println("Hours : ");
                int hours = input.nextInt();
                PartTime pt = new PartTime(name, age, subject, hours, salary);
                pt.print();
            } else if (pilihan2.equals("2")) {
                System.out.println("FullTime Details : ");
                System.out.println("Name :");
                String name = input.nextLine();
                System.out.println("Subject : ");
                String subject = input.nextLine();
                System.out.println("Age : ");
                int age = input.nextInt();
                input .nextLine();
                System.out.println("Hours : ");
                int hours = input.nextInt();
                System.out.println("Salary : ");
                int salary = input.nextInt();
                System.out.println("Unit : ");
                String unit = input.nextLine();
                FullTime ft = new FullTime(name, age, subject, salary, unit);
                ft.print();
            }
        }
    }
}    
