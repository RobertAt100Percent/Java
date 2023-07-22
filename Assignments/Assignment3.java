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

        switch(grade/10) {
            // for >= 90
            case 10.0:
            case 9.0:
               System.out.println(grade + " is equal to an A");
               break;
            // for >= 80 and <90
            case 8.0:
               System.out.println(grade + " is equal to an B");
               break;
            // for >= 70 and <80
            case 7.0:
               System.out.println(grade + " is equal to an C");
               break;
            // for >= 60 and <70
            case 6.0:
               System.out.println(grade + " is equal to an D");
               break;
            // for >= 50 and <60
            case 5.0:
               System.out.println(grade + " is equal to an E");
               break;
            // for < 50
            default:
               System.out.println(grade + " is equal to an F");
               break;
          }

    }
}
