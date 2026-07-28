package StudentManagement;

public class Student {
    private int id;
    private String name;
    private int age;
    private String course;


    public Student(int id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
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

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    public boolean isAdult(){
        if(getAge() > 18){
            return true;
        } else {
            return false;
        }
    }
    public void displayStudent(){
        System.out.println("Student ID :  " + getId() + "\n" + "Name       : " + getName() + "\n" + "Age        : " + getAge() + "\n" + "Course     : " + getCourse() + "\n" + "Adult      : " + (isAdult() ? "Yes" : "No"));
    }
}

class Main {
    public static void main(String[] args) {
        Student st1 = new Student(101, "Gabriel" , 28, "Computer Science");
        Student st2 = new Student(102, "Marley", + 24 , "Mathematics");
        Student st3 = new Student(103, "Vinisius", 30, "Physics");

        //Displaying the Student and their information
        st1.displayStudent();
        System.out.println(" ");
        st2.displayStudent();
        System.out.println(" ");
        st3.displayStudent();
        System.out.println(" ");

        //This part checks on the oldest Student

        Student temp = StudentUtility.oldestStudent(st1, st2);
        System.out.println("The oldest student in the information above is");
        temp.displayStudent();

        Student oldest = StudentUtility.oldestStudent(temp, st3);
        System.out.println("The oldest student in the among the 3");
        oldest.displayStudent();

        //This part checks on the youngest student
        Student temp2 = StudentUtility.youngestStudent(st1, st2);
        System.out.println("The oldest student in the information above is");
        temp.displayStudent();

        Student youngestStudent = StudentUtility.youngestStudent(temp, st3);
        System.out.println("The oldest student in the among the 3");
        oldest.displayStudent();



    }
}


class StudentUtility {

    public static Student oldestStudent(Student s1, Student s2){
        Student student = s1.getAge() > s2.getAge() ? s1 : s2;
        return student;
    }
    public static Student youngestStudent(Student s1, Student s2){
        Student student = s1.getAge() < s2.getAge() ? s1 : s2;
        return student;
    }

}
