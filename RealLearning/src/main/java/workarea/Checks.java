package workarea;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;

public class Checks implements Cloneable {
    public static void main(String[] args) {

        String file = "value";
        String janet = "Janet";
        boolean result = file.isBlank();
        boolean result2 = file.equals(janet);
//       System.out.println("This is complet lent  " + file.length() + " " + janet.length());

        //Challenge

//        String output = "  Janet     Felix  ";
//        System.out.println("Output " + output.length());
//        String input = output.trim();
//        System.out.println("Input " + input.length());
//
//
//
//        int[] value = {1, 2, 3, 4};
//        String[] values = {"Janet", "Bellow"};
//        double[] value2 = {1.0, 2.0};
//        StringBuilder sb = new StringBuilder();
//        boolean spaceAdded = false;
//
//        char[] cap = input.toCharArray();
//        //System.out.println("char " + Arrays.toString(cap));
//
//        for (int i = 0; i < input.length(); i++){
//            char c = input.charAt(i);
//            if(c != ' '){
//                sb.append(c);
//                spaceAdded = false;
//
//            } else if(!spaceAdded){
//                sb.append(' ');
//                spaceAdded = true;
//            }
//        }

//       String resultQ = input.replaceAll("\\s+", " ");
//        String[] Arr = resultQ.split(" ");
//
//
//        System.out.println("The result without a space is: " +  sb.toString().length() + " " + resultQ);
//        System.out.println("The outcome of split is " + Arrays.toString(Arr));
//
//        learn.myths("Gabriel");
//        learn cc = new learn() {
//            @Override
//            public void myth() {
//                learn.super.myth();
//            }
//
//            @Override
//            public void kettle() {
//                System.out.println("I am a kettle");
//            }
//        };
//        cc.myth();
//
//        Predicate<String> p = new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return false;
//            }
//        };
//
//        Consumer<String> c = new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        }

        ArrayList<String> name = new ArrayList<>();
        List<String> names = name;
        name.add("Kelvin");
        name.add("Gabriel");

        System.out.println(names.get(0));
        System.out.println(names.get(1));

        String s = null;
        Integer n = null;




//
//    }
//
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

        performDivision();





    }


    static void performDivision (){
        System.out.println("Kindly Enter your numbers");
        System.out.print("Enter number to be divided: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print("Enter the divisor number: ");
        int den = sc.nextInt();

        try {

            if(den == 0){
                throw new IllegalArgumentException();
            } else {
                int result = num / den;
                System.out.println("The division value is: " + result);
            }

        } catch (IllegalArgumentException e){
            System.out.println("The denominator can not be zero: " + e.getMessage());
        }


    }

}

//interface  learn {
//
//    int finalValue = 20;
//
//    default void myth(){
//        myths();
//        System.out.println("This is a test of the default method in interface");
//    }
//
//    private void myths() {
//        myths("name");
//        System.out.println("Testing the private method in the interface too");
//
//    }
//
//    static void myths(String name){
//        System.out.println("Testing the static method in the interface two" + finalValue + name);
//    }
//
//    void kettle();
//}

