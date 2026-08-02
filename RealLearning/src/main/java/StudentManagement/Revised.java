package StudentManagement;

import java.util.*;

public class Revised {

    public static void main(String[] args) {


        ArrayList<String> student = new ArrayList<String>();
        student.add("Gabriel");
        student.add("Janet");
        student.add("Abel");

        String[] caps = {"Joseph", "Caleb"};

       System.out.println( Collections.addAll(student, caps ));
       //System.out.println(student);
       Collections.sort(student);
       System.out.println(student);

       //system.out.println(student);

        List<String> teacher = new ArrayList<String>();
        teacher.add("Kemi");
        teacher.add("Fred");
        teacher.add("oemi");
        teacher.add("Gabriel");
        System.out.println(teacher);
        Collections.sort(teacher);

        List<String> t = Collections.synchronizedList(teacher);

        String carrot = "flowed";
       boolean value = carrot.matches("\\D+");
       System.out.println(value);

       List capetown = new ArrayList<>();
        capetown.add("Janet");
        capetown.add("Gabriel");
        capetown.add("Janet");
        capetown.add("Sandra");

        Collections.sort(capetown);

        System.out.println(capetown);



       //new Revised().checkings(caps);

//        Person p1 = new Person(10, "Gabriel", 20);
//        Person p2 = new Person(10, "Fidelis", 25);
//
//
//        Map<Integer, Person> Class = new HashMap<>();
//        Class.put(1, p1);
//        Class.put(2, p2);
//
//        //System.out.println(Class.entrySet());
//
//        Set<Map.Entry<Integer, Person >> EntrySet = Class.entrySet();
//
//        for(Map.Entry<Integer, Person> outings : EntrySet) {
//            System.out.println(outings.getKey() );
//            System.out.println(outings.getValue().getName());
//        }

        String verify = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        String email = "gabrieljames85gmail";

        if((email.matches(verify))){
            System.out.println("Very correct information");
        } else {
            System.out.println("This is false");
        }

    }

    public void checkings(String ...n){
        System.out.println(Arrays.toString(n));
    }

    public String calculate(int k, int A, String ops){
        try {
            if (ops.equals("**")) {
                throw new illegalOperationException("you have entered a wrong operation for maths ");
            }
            return null;
        } catch (illegalOperationException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }


}

class illegalOperationException extends Exception {
    illegalOperationException(String e){
        super(e);
    }
}
