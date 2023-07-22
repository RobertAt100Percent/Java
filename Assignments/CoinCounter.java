package Assignments;
import java.util.Scanner;

public class CoinCounter {
public static void main(String[] args){
    try (//declare and initalize all needed variables
        //import and use the scanner object
    Scanner scan = new Scanner(System.in)) {
        double p = 0 ,n = 0,d = 0,q = 0;
        //prompt the user
        System.out.println("**********Welcome To The Year Up Change Counter**********");
        System.out.println("This program will take your change and credit your account.");


        System.out.print("How many pennies are you inputting : ");
        p = scan.nextInt();  // Read user input
        p = p * 0.01;

        System.out.print("How many nickles are you inputting : ");
        n = scan.nextInt();  // Read user input
        n = n * 0.05;

        System.out.print("How many dimes are you inputting : ");
        d = scan.nextInt();  // Read user input
        d = d * 0.1;

        System.out.print("How many quarters are you inputting : ");
        q = scan.nextInt();  // Read user input
        q = q * 0.25;

        System.out.println("**********Thank You!!!**********");
        double sum = p+n+d+q;
        double cents = sum - Math.floor(sum);

        System.out.println("we will now credit your account with " + String.format("%.2f", Math.floor(sum))  +" dollars and " + String.format("%.2f", cents) +" cents.");
    }
    


}//end of main class    
}//end of package

