package EmployeeManageMentSystem;

import java.util.Scanner;

public class Management {

    static class Employee {
        String name;
        long code;
        String designation;
        int exp;
        int age;
    }

    static int num;
    static int max = 20;

    static Employee[] emp = new Employee[max];
    static Scanner sc = new Scanner(System.in);


    static void build() {
        System.out.println("Build the Table \n");
        System.out.println("Maximum Entries can be " + max);
        System.out.println("Enter the number of " + " Entries required");

        num = sc.nextInt();

        if(num > 20){
            System.out.println("Maximum number of " + " Entries are 20");
            num = 20;
        }

        System.out.println("Enter the following data.");

        for (int i = 0; i < num; i++) {
            System.out.println("Name ");
            emp[i].name = sc.next();
            System.out.println("Employee ID ");
            emp[i].code = sc.nextLong();
            System.out.println("Designation ");
            emp[i].designation = sc.next();
            System.out.println("Experience ");
            emp[i].exp = sc.nextInt();
            System.out.println("Age ");
            emp[i].age = sc.nextInt();
        }

        showMenu();


    }

    static void insert(){

        if(num < max){
            int i = num;
            num++;

            System.out.print("Enter the information " + "of the Employee");
            System.out.print("Name ");
            emp[i].name = sc.next();

            System.out.print("Employee ID");
            emp[i].code = sc.nextLong();

            System.out.print("Designation");
            emp[i].designation = sc.next();

            System.out.println("Experience");
            emp[i].exp = sc.nextInt();

            System.out.print("Age");
            emp[i].age = Integer.parseInt(sc.next());
        } else {
            System.out.println("Employee Table Full! ");
        }

        showMenu();
    }

    static void deleteIndex(int i){
        for(int j = i; j < num -1; j++){
            emp[j].name = emp[j + 1].name;
            emp[j].code = emp[j + 1].code;
            emp[j].designation = emp[j + 1].designation;
            emp[j].exp = emp[j + 1].exp;
            emp[j].age = emp[j + 1].age;
        }
    }


    static void deleteRecord(){
        System.out.println("Enter the EmployeeID " + "to Delete Record");
        int code = sc.nextInt();

        for(int i = 0; i < num; i++){
            if(emp[i].code == code ){
                deleteIndex(i);
                num--;
                break;
            }
        }

        showMenu();

    }

    static void searchRecord()
    {
        System.out.println("Enter the Employee"+" ID to Search Record");

        int code = sc.nextInt();

        for (int i = 0; i < num; i++) {

            // If the data is found
            if (emp[i].code == code) {
                System.out.println("Name " + emp[i].name);

                System.out.println("Employee ID " + emp[i].code);

                System.out.println("Designation " + emp[i].designation);

                System.out.println("Experience " + emp[i].exp);

                System.out.println("Age " + emp[i].age);
                break;
            }
        }

        showMenu();
    }

    static void showMenu()
    {

        System.out.println("-------------------------"
                + "GeeksforGeeks Employee"
                + " Management System"
                + "-------------------------\n");

        System.out.println("Available Options:\n");
        System.out.print("Build Table         (1)\n");
        System.out.print("Insert New Entry    (2)\n");
        System.out.print("Delete Entry        (3)\n");
        System.out.print("Search a Record     (4)\n");
        System.out.print("Exit                (5)\n");

        int option = sc.nextInt();

        // Input Options
        // Call function on the basis of the
        // above option
        if (option == 1) {
            build();
        }
        else if (option == 2) {
            insert();
        }
        else if (option == 3) {
            deleteRecord();
        }
        else if (option == 4) {
            searchRecord();
        }
        else if (option == 5) {
            return;
        }
        else {
            System.out.println("Expected Options" + " are 1/2/3/4/5");
            showMenu();
        }
    }

    public static void main (String[] args) {
        showMenu();
    }


}

