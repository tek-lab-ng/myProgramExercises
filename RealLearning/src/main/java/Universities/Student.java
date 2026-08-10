package Universities;

//This is the Student class
public class Student extends LibraryMember {

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