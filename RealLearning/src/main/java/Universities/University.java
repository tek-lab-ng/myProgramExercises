package Universities;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class University {

        private List<Person> people = new ArrayList<>();

        public void addPerson(Person person) {

            String verify = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

            if (person.getAge() < 18) {
                throw new InvalidAgeException(person.getName() + " must be at least 18 years old.");
            }

            if (!person.getEmail().matches(verify)) {
                throw new InvalidEmailException(
                        "Invalid email for " + person.getName()
                );
            }

            for (Person p : people) {
                if (p.getId() == person.getId()) {
                    throw new DuplicatePersonIdException("The id enter for this person " + person.getName() + " already exist");
                }

            }

            people.add(person);

        }

        public Person findById(int id) {
            for (Person person : people){
                if(person.getId() == id)
                    return person;
            }
            return null;
        }

        public void displayEveryone() {
            for (Person person : people){
                person.introduce();
            }
        }

        public List<Person> getPerson(){
            return people;
        }


        public List<Person> findPerson(Predicate<Person> predicate){
            List<Person> pops = new ArrayList<>();
            for(Person person : people){
                if(predicate.test(person)){
                    pops.add(person);
                }
            }
            return pops;
        }

}
