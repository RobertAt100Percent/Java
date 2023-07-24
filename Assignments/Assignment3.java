package Assignments;
import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args){
        //declare and initalize all needed variables
        //import and use the scanner object
        Scanner scan = new Scanner(System.in);
        String name, UserName;
        int num;
        double grade;
        
        //promtp the user about the program
        System.out.println("Welcome to the Year Up Grading Program!!!"
        + "\n\nStep 1: UserName Creation"
        + "\nLets create a username for you");
        
        //ask the user to enter their name
        System.out.print("what is your name --> ");

        //store the user input in the string variable name, using the scanner object and scanner method .nextLine()
        name = scan.nextLine();

        //make all the letters lower case in the name variable and then assign it to the string variable UserName
        UserName = name.toLowerCase();

        //only use the first 3 letter form the username variable and assign it back to it self
        //we can also add a string in at the end because the substring method is a string method
        UserName = UserName.substring(0, 3) + "_YearUp";

        //display the username to the user
        System.out.println(UserName + "\n\n");

        //step 2
        //prompt the user to enter a whole number
        System.out.print("Step 2: Odd Or Even"
        + "\n\nSupply an integer between 1-100 and the program will determine if that integer is odd or even --> ");

        //store the user input in integer variable num
        num = scan.nextInt();

        //make a if statement that will show if the user number is odd or even
        if(num % 2 == 0){
            //display to the user the even number
            System.out.println(num + " is an even number\n");
        }
        else{
            //display to the user the odd number
            System.out.println(num + " is an odd number\n");
        }
    
        //Step 3

        System.out.print("the program will now turn a numerical grade into a letter grade."
        + "Input a numerical grade --> "); 

        grade = scan.nextDouble();

        if (grade>=90) {
         System.out.println(grade + " is equal to a A");
       } else if (grade>=80) {
         System.out.println(grade + " is equal to a B");         
       } else if (grade>=70) {
         System.out.println(grade + " is equal to a C");
       } else if (grade>=60) {
         System.out.println(grade + " is equal to a D");
       } else if (grade>=50) {
         System.out.println(grade + " is equal to a E");
       } else {
         System.out.println(grade + " is equal to a F");
       }

    }
}
