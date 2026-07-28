package workarea;

import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Scanner;


public class Revision {
    static int cup;
    public static void main(String[] args) {
//        System.out.println("We are testing things out really quickly: ");
//        String url = "jdbc:mysql://localhost:3306/school";
//        String user = "root";
//        String password = "pass123";
//
//        try (Connection conn = DriverManager.getConnection(url, user, password)) {
//            System.out.println("Connected to the database!");
//            // Your database operations go here
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Kindly enter your complete name, age, amount in bank: ");
//        String respond = sc.nextLine();
//        int age = sc.nextInt();
//        double amount = sc.nextDouble();
//
//        System.out.println("Your name is: " + respond + " " +"Age: "+ age + " " + "Amount in bank: "  + amount);
//
//        String[] callUp = {"Gabriel","Gabriel", "James"};
//        String kiss = "abs, blee, cat, dat, for";
//        Scanner sc = new Scanner(kiss);
//        while(sc.hasNext()){
//            System.out.println("The values are: " + sc.next());
//        }

//        int kip = 1500000000;
//         kip = 1580484940;
//
//         long light = 1L;
//
//         int sum;
//
//
//        if((0 < a) && (a < b) && (b < 1000000)){
//            sum = a + b;
//        }

//        String cap = "25";
//
//        Integer kip = Integer.valueOf(cap);
//        Integer kips = Integer.parseInt(cap);
//
//        int kipps = kips;
//
//        System.out.println(kip + " " + kips +" " + kipps + " ");
//
//        int result = kip.compareTo(kips);
//        Boolean result2 = kip.equals(kips);

//        games();
//        Customer[] cus = {new Customer("Ade","Janet"), new Customer("Ezeogu", "Femi")};
////        quite(cus);
//
//        int[][] are = {{1,2,3}, {2,3,4}, {4,5,6}};
//        System.out.println("There are: " + are.length + " " + "are arrays");
//
//        for (int i = 0; i < are.length; i++) {
//            for (int j = 0; j < are[i].length; j++) {
//
//                System.out.print(are[i][j]);
//            }
//            System.out.println();
//
//        }

        int[] capstone = {1, 2, 3, 4, 5, 6};
        int[] capstone$ = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("The value of this array for primitive integer is: " + Arrays.asList(capstone));
        System.out.println("The value of this array for Object integer is: " + Arrays.asList(capstone$));

        int mismatch = Arrays.mismatch(capstone, capstone$);
//        System.out.print(mismatch);
//
//        System.out.println("The toString value will be: " + Arrays.toString(capstone));
        // System.out.println("The toString value will be: " + Arrays.toString(capstone$));

        //  System.out.println("The stream value will be: " + Arrays.stream(capstone));

        String s = String.valueOf(15);

        String longValue = "CreamyMilky";
        String shortValue = "Holland";

        int key = longValue.compareTo(shortValue);
        char so = longValue.charAt(2);

//       System.out.println("The output of the substring value: " + longValue.substring(2, 10));

//        StringBuffer cat = new StringBuffer("Marley");
//        System.out.println("The value of the StringBuffer is:  " + cat);
//        System.out.println("The value of the StringBuffer modified is: " + cat.append(" Vinisius"));
//        System.out.println("The modified out again is: " + cat.insert(6, "="));


        //Arrays.stream(capstone).forEach(n -> System.out.print(n));

        //"   Marley     Vinisius   "

        String assignment = "   Marley     Vinisius   ";
//        String result = assignment.trim().replace("\\s+", " ");
//        System.out.println(result.replace("  ", ""));
//        System.out.println(assignment.length());
//        System.out.println(result);


        //"   Marley     Vinisius     Junior   "

//        String input = "   Marley     Vinisius     Junior   ";
//        String reduce = input.trim();
//        //System.out.print(reduce);
//        StringBuilder  result = new StringBuilder();
//        boolean spaceAdd = false;
//
//        for(int i = 0; i < reduce.length(); i++){
//            char c = reduce.charAt(i);
//            if(c != ' '){
//                result.append(c);
//                spaceAdd = false;
//            } else {
//                if(!spaceAdd){
//                    result.append(' ');
//                    spaceAdd = true;
//                }
//            }
//        }
//
//        System.out.print("The result is: " + result);

//        String caps = "Truth";
//        String file = "Truth";
//
//        String calf = new String("Truth");
//
//
//        System.out.println("The outcome of this: " + (caps == file));
//        System.out.println("The outcome of this: " + (file == calf));
//
//        StringBuffer sb = new StringBuffer();
//        sb.append("Slow");
//        String sba = null;
//        sba = "Money";
//        System.out.println("Is the value empty: " + sb.isEmpty());
//        System.out.println("Is this value empty: " + sba.isEmpty());
//        System.out.println("is the value for int empty: "  );

       // (condition) ? if it is true : false:
      int age = 20;
//       age =  (age == 0) ? 25 : age;
//
//       while (age >= 20){
//           System.out.println("Yes thats true");
//           age = 18;
//       }
//
//       int i = 1;
//       do {
//           System.out.println("The age is: " + age);
//           i++;
//       }while(i < 5);

       for(int i = 0; i < 5; i++) {
           System.out.println("The value of age: " + age);
       }

       String[] name = {"Gabriel", "Bello", "Janet"};
       String[] flow = new String[10];
       flow[0] = "Janet";
       flow[1] = "Gabriel";
       flow[2] = "Razak";
       flow[3] = "Chidinma";

       for(String names: flow){
           System.out.println(names);
       }

//      System.out.println("The outcome: " + age);

//        String firstname = "";
//        firstname = (firstname.isEmpty()) ? "Bello" : firstname;
//        System.out.println("The firstname is: " + firstname);




    }
    public static void games(){
        System.out.println("This is all about a guessing game");

        //Number of times that the game can be played 5 times man.

        int times = 5;

        //Guessed value will be 1 to 20

        int valueToBeGuessed = (int) (1 + (Math.random() * 20));

        //Scanner class to accept value from users playing the game.

        Scanner sc = new Scanner(System.in);
        System.out.print("Kindly enter the guessed value to play the game from 1 - 20: " + valueToBeGuessed + "  : ");
        for (int i = 0; i < times; i++) {
            int myGuess = sc.nextInt();
            if(myGuess == valueToBeGuessed){
                System.out.println("You have guessed correct the value is: " + valueToBeGuessed);
                break;
            } else if (myGuess > valueToBeGuessed)
                System.out.println("Ouch almost, the value is too high");
            else
                System.out.println("😒 The value is too low, try again");


            if ((i == 4)) {
                System.out.println("You have failed this test");
            }
        }
    }

//    static String kiss = "kiss";
//
//    public static void quite(Customer... n){
////        quites();
//        String a = kiss;
//       String output =  n[0].getFirstName();
//       System.out.print(output);
//
//       for (Customer i: n)
//           System.out.println(i.getFirstName() + " " + i.getFirstName());
//        System.out.print(kiss);
//    }

//    public static void quites() {
//        quite();
//        kiss;
//    }
}
