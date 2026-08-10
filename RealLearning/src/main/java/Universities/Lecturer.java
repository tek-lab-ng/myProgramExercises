package Universities;

import java.util.Scanner;

//This is the Lecturer class
public class Lecturer extends LibraryMember {

    private String department;
    private int salary;

    public Lecturer(int id, String name, int age, String department, String libraryCardNumber, String email, int salary) {
        super(id, name, age, libraryCardNumber, email);
        this.department = department;
        this.salary = salary;

    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void assignGrade(Student s){
        Scanner in = new Scanner(System.in);
        System.out.print("Kindly enter the grade for the student selected: ");
        s.setGrade(in.next());
        System.out.println("The name of student with grade:  " + s.getName() +"  " + s.getGrade());
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + getName()
                + " and I teach " + getDepartment());
    }
}