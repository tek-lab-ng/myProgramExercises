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


       //new Revised().checkings(caps);

    }

    public void checkings(String ...n){
        System.out.println(Arrays.toString(n));
    }
}
