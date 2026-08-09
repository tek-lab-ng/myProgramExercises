package Universities;

import java.util.*;
import java.util.function.Predicate;

//The University Management Structure
public abstract class Person {
    private int id;
    private String name;
    private int age;
    private String email;


    public Person(int id, String name, int age, String email) {

            this.id = id;
            this.name = name;
            this.age = age;
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

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
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
class Student extends LibraryMember {

    private String course;
    private String grade;

    Student(int id, String name, int age, String course, String libraryCardNumber, String email){
            super(id, name, age, libraryCardNumber, email);
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

    public static void main(String[] args) {

        University people = new University();

        Student s1 = new Student(1, "Gabriel", 25, "Computer Science", "010", "gabrieljames85@gmail.com" );

        Student s2 = new Student(2, "Jayden", 21, "Chemistry", "011", "jayden@gmail.com" );

        Lecturer l1 = new Lecturer(3, "Fred", 40, "Computer Science", "012", "fred@gmail.com", 10000);
        Lecturer l2 = new Lecturer(4, "Lucy", 45, "Physics", "012", "Lucy@gmail.com", 20000);

        Security sec1 = new Security(5, "Mike", 28, "Mike@gmail.com", 1);
        Security sec2 = new Security(6, "Ben", 29, "Ben@gmail.com", 2);


        Janitor jan1 = new Janitor(7, "Kemi", 30, "Kemi@gmail.com", "First Floor");
        Janitor jan2 = new Janitor(8, "Aunty", 28, "Aunty@gmail.com", "Second Floor");

       try {
           people.addPerson(s1);
           people.addPerson(s2);
           people.addPerson(l1);
           people.addPerson(l2);
           people.addPerson(sec1);
           people.addPerson(sec2);
           people.addPerson(jan1);
           people.addPerson(jan2);
       } catch (InvalidAgeException | InvalidEmailException | DuplicatePersonIdException e){
           System.out.println(e.getMessage());
       }

       //people.displayEveryone();
        //challenge 1
        people.getPerson().forEach(Person::introduce);
        people.getPerson().stream().forEach(Person::introduce);

        //challenge 2
       List<Person> personAdult = people.getPerson().stream().filter(n -> n.getAge() > 18).toList();
       //challenge 3

        List<Lecturer> lecturers = people.getPerson().stream().filter(person -> person instanceof Lecturer).map(person-> (Lecturer) person).toList();
       lecturers.forEach(lect -> System.out.println(lect.getDepartment()));
 //       people.getPerson().stream().filter(person -> person.)
        //Challenge 4
        List<String> output = people.getPerson().stream().map(Person::getEmail).toList();


       Predicate<Person> predicate = (Person p) -> p.getName().equals("Gabriel");

       List<Person> results = people.findPerson(predicate);

       //results.forEach(n -> System.out.println(n.getName()));


       List<Person> everyOne = people.getPerson();

       Collections.sort(everyOne, (n1, n2) -> Integer.compare(n1.getAge(), n2.getAge()));

       everyOne.forEach(n-> System.out.println(n.getName()));

//       int numberOfPerson = people.getPerson().size();
//       System.out.println(numberOfPerson);



    }

}

//Creating the InvalidAgeException Class to handle wrong age input
class InvalidAgeException extends RuntimeException{
    public InvalidAgeException(String e){
        super(e);
    }
}

//Creating the DuplicatePersonIdException Class to handle id duplicate
class DuplicatePersonIdException extends RuntimeException {
    public DuplicatePersonIdException(String e){
        super(e);
    }
}

class InvalidEmailException extends RuntimeException {
    public InvalidEmailException(String e){
        super(e);
    }
}
