//public class NumMath {
//
//    public static void main(String[] args) {
//        System.out.println(" This class is intended to print all even numbers from 1 to 50");
//
//        for (int i = 1; i<=50; i++ ){
//            if(i % 2 == 0){
//                System.out.println("The even numbers from 1 to 50 include: " + i);
//
//            }
//        }
//    }
//}

//class SUMMath {
//
//    public static void main(String[] args) {
//        System.out.println("This is meant to print the sum numbers from 1 to 100");
//
//        int sum = 0;
//
//        for (int i = 1; i <= 100; i++) {
//            sum = sum + i;
//        }
//        System.out.println("The sum from 1 to 100 is: " + sum);
//
//    }
//}

import java.util.Scanner;

class GuessMath {

    public static void main(String[] args) {
        System.out.println("Let play a guess game of numbers");

        int limit = (int) ((Math.random() * 10) + 1); // This line produce random number from 1 to 10
       System.out.println(limit);
        Scanner value = new Scanner(System.in);

        while(limit != 0){

            System.out.print("Kindly guess our random number from 1 to 10:  ");
            int myGuess = value.nextInt();
            if(myGuess == limit){
                System.out.println("You have guessed right: " + myGuess);
                break;
            }
        }
        value.close();
    }
}

class AtmPin{

    public static void main(String[] args) {

        int attempt = 3;
        int actualPin = 8855;
        Scanner myPin = new Scanner(System.in);

        int i = 0;
        do {
            System.out.print("Please enter your pin:  ");
            int enteredValue = myPin.nextInt();
            if (enteredValue != actualPin){
                i++;
                System.out.println("You have entered the wrong pin");
                System.out.println("You have " + (attempt - i) + " attempts remaining" );
                if (i == attempt) break;
            } else {
                System.out.println("You have entered correct pin");
                break;
            }
        }while (i <= attempt);

        myPin.close();
    }
}