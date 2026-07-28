import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of num: ");
        int num = in.nextInt();

        //constrain 1<= num <=200

        boolean vav = 1<= num && num <=200;

        int sumNum = 0;

        while(vav){

            for (int i = 0; i <= num ; i++) {

                if(i % 7 == 0){

                    sumNum += i;
                }
            }
            vav = false;
        }
        System.out.println("The value of the sum is: " + sumNum);
    }
}
