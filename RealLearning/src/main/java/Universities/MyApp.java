package Universities;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MyApp {

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
        // people.getPerson().stream().forEach(Person::introduce);

        //challenge 2
        List<Person> personAdult = people.getPerson().stream().filter(n -> n.getAge() > 18).toList();
        //challenge 3

        List<Lecturer> lecturers = people.getPerson().stream().filter(person -> person instanceof Lecturer).map(person-> (Lecturer) person).toList();
        //To get the department of lecturers
        lecturers.forEach(lect -> System.out.println(lect.getDepartment()));
        //people.getPerson().stream().filter(person -> person.)
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
        // Finding person by id
        Person person =  people.findByName("Gabriel");
        System.out.println("Using the find by name feature " + person.getEmail() + " " + person.getName() + " " + person.getAge());
        people.removePerson(1);
        System.out.println(people.getPerson().stream().map(n->n.getName()).toList());

        System.out.println("This are the lecturers in the university " + people.displayLecturers().stream().map(n->n.getName()).toList());



    }
}