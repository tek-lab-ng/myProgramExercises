package StudentManagement;

public abstract class Person {
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
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

class Students extends Person {

    private String course;

    Students (int id, String name, int age, String course){
        super(id, name, age);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + super.getName()
                + " and I study " + getCourse());
    }

}

class Lecturer extends Person {

    private String department;

    public Lecturer(int id, String name, int age, String department) {
        super(id, name, age);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + super.getName()
                + " and I teach " + getDepartment());
    }
}

class Security extends Person {

    public Security(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + getName()
                + " and I work at Gate 2.");
    }
}