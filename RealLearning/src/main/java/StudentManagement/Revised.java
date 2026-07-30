package StudentManagement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Revised {

    public static void main(String[] args) {


        ArrayList<String> student = new ArrayList<String>();
        student.add("Gabriel");
        student.add("Janet");

        String[] caps = {"Joseph", "Caleb"};

       System.out.println( Collections.addAll(student, caps ));
       System.out.println(student);
       Collections.sort(student);
       System.out.println(student);

       new Revised().checkings(caps);

       
       
    }

    public void checkings(String ...n){
        System.out.println(Arrays.toString(n));
    }
}
