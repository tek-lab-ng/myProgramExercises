package Universities;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MyApp {

    public static void main(String[] args)  {

        University people = new University();

        Student s1 = new Student(1, "Gabriel", 25, "Computer Science", "010", "gabrieljames85@gmail.com" );

        Student s2 = new Student(2, "Jayden", 21, "Chemistry", "011", "jayden@gmail.com" );

        Lecturer l1 = new Lecturer(3, "Fred", 40, "Computer Science", "012", "fred@gmail.com", 700000);
        Lecturer l2 = new Lecturer(4, "Lucy", 45, "Physics", "012", "Lucy@gmail.com", 700000);

        Security sec1 = new Security(5, "Mike", 28, "Mike@gmail.com", 1, 200000);
        Security sec2 = new Security(6, "Ben", 29, "Ben@gmail.com", 2, 200000);


        Janitor jan1 = new Janitor(7, "Kemi", 30, "Kemi@gmail.com", "First Floor", 15000);
        Janitor jan2 = new Janitor(8, "Aunty", 28, "Aunty@gmail.com", "Second Floor", 150000);

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

        //Implemented the Interface Payable and filtered the class that implemented it
        Payable payable = l1;
        System.out.println("The salary of this lecture l1 is: " + payable.calculatePay());


        List<Payable> payables = new ArrayList<>(people.getPerson().stream().filter(persons -> persons instanceof Payable).map(persons -> (Payable) persons).toList());
//        payables.addAll(people.getPerson().stream().filter(persons -> persons instanceof Janitor).map(persons-> (Janitor) persons).toList());
//        payables.addAll(people.getPerson().stream().filter(persons -> persons instanceof Security).map(persons-> (Security) persons).toList());

        Map<String, Double> allPay = payables.stream().collect(Collectors.groupingBy(n-> n.getClass().getSimpleName(), Collectors.summingDouble(Payable::calculatePay)));

        //Printed out the class that implemented payable and the total money in the class calculated...
        allPay.forEach((ClassName, TotalValue) -> {
            System.out.println("My Class: " + ClassName + "->" + " TotalValue  " + TotalValue);
        });

        try{
            Path filepath = Paths.get("C:\\Users\\Gabriel.Osaji\\Documents\\Public Class A\\RealLearning\\src\\main\\java\\Universities");
            System.out.println("  Challenge 1");
            //challenge 1
            Files.walk(filepath).forEach(System.out::println);

            System.out.println("  Challenge 2");

            //challenge 2
            Files.walk(filepath).filter(Files::isRegularFile).forEach(path -> System.out.println("The paths that are regularFiles are" + path));

            System.out.println("  Challenge 3");
            //challenge 3
            System.out.println("The list files ending with .txt");
            Files.walk(filepath).filter(n->n.toString().endsWith(".txt")).forEach(System.out::println);

            //challenge 4
            System.out.println("The list files ending with .txt only in the Parent folder not child folder");
            Files.walk(filepath, 1).filter(n->n.toString().endsWith(".txt")).forEach(System.out::println);

            //challenge 5 and 6
            List<String> filenames = Files.walk(filepath).filter(Files::isRegularFile).map(path -> path.getFileName().toString()).toList();
//            System.out.println(filenames);

        }catch (IOException e){
            throw new RuntimeException();
        }


    }
}