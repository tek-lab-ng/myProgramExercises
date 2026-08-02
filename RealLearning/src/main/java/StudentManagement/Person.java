package StudentManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//The University Management Structure
abstract class Person {
    private int id;
    private String name;
    private int age;
    private String email;

    public Person(int id, String name, int age, String email) {
            this.id = id;
            this.name = name;
            if (age >= 18){
                this.age = age;
            } else {
                throw new InvalidAgeException("This user " + name+ " is not valid to be a student or staff, need to be 18 and above in age");
            }
            this.email = email;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void introduce();


}

//This is the Library Faculty class
abstract class  LibraryMember  extends Person{

    private String libraryCardNumber;

    public LibraryMember(int id, String name, int age, String libraryCardNumber, String email) {
        super(id, name, age, email);
        this.libraryCardNumber = libraryCardNumber;
    }

    public String getLibraryCardNumber() {
        return libraryCardNumber;
    }

    public void setLibraryCardNumber(String libraryCardNumber) {
        this.libraryCardNumber = libraryCardNumber;
    }
}

//This is the Student class
class Students extends LibraryMember {

    private String course;
    private String grade;

    Students (int id, String name, int age, String course, String libraryCardNumber, String email){
        super(id, name, age, libraryCardNumber, email );
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setGrade(String grade){
        this.grade = grade;
    }
    public String getGrade(){return grade;}

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + getName()
                + " and I study " + getCourse());
    }

}

//This is the Lecturer class
class Lecturer extends LibraryMember {

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

    public void assignGrade(Students s){
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
//This is the Security class
class Security extends Person {
    private int gateNumber;

    public Security(int id, String name, int age, String email, int gateNumber) {
        super(id, name, age, email);
        this.gateNumber = gateNumber;
    }

    public void setGateNumber(int gateNumber){
        this.gateNumber = gateNumber;
    }

    public int getGateNumber(){
        return gateNumber;
    }
    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + getName()
                + " and I work at Gate " + getGateNumber());
    }
}
//This is the Janitor class
class Janitor extends Person {

    private String cleanArea;

    public Janitor(int id, String name, int age, String email, String cleanArea) {
        super(id, name, age, email);
        this.cleanArea = cleanArea;
    }

    public void setCleanArea(String cleanArea){
        this.cleanArea = cleanArea;
    }

    public String getCleanArea(){
        return cleanArea;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + getName()
                + " and I clean on the " + getCleanArea());
    }
}



class MyApp {

    static List<Person> people;

    public static void main(String[] args) {

        people = new ArrayList<>();

        Students s1 = new Students(1, "Gabriel", 20, "Computer Science", "010", "gabrieljames85@gmail.com" );
        try{
            Students s2 = new Students(2, "Jayden", 17, "Chemistry", "011", "jayden@gmail.com" );
            people.add(s2);
        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }

        Lecturer l1 = new Lecturer(1, "Fred", 40, "Computer Science", "012", "fred@gmail.com", 10000);
        Lecturer l2 = new Lecturer(2, "Lucy", 45, "Physics", "012", "Lucy@gmail.com", 20000);

        Security sec1 = new Security(3, "Mike", 28, "Mike@gmail.com", 1);
        Security sec2 = new Security(4, "Ben", 29, "Ben@gmail.com", 2);


        Janitor jan1 = new Janitor(5, "Kemi", 30, "Kemi@gmail.com", "First Floor");
        Janitor jan2 = new Janitor(6, "Aunty", 28, "Aunty@gmail.com", "Second Floor");

        people.add(s1);
        people.add(l1);
        people.add(l2);
        people.add(sec1);
        people.add(sec2);
        people.add(jan1);
        people.add(jan2);

        for (Person person : people){
            person.introduce();
        }

    }

}

//Creating the InvalidAgeException Class to handle wrong age input
class InvalidAgeException extends RuntimeException{
    public InvalidAgeException(String e){
        super(e);
    }
}