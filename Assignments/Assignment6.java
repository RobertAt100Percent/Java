package Assignments;

//import needed classes
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import java.lang.Math;

public class Assignment6 {
    public static void main(String[] args){
        //import the scanner class to allow user input
        Scanner scan = new Scanner(System.in);
        //declare and initalize all needed variables
        String SquareOrCircle = null;

        //call the introduction(); method
        introduction();    

        //prompt the user
        System.out.print("Square, Circle, or Quit - (s/c/q) : ");

        //allow for user input
        //stroe in the String variable, SquareOrCircle
        SquareOrCircle = scan.nextLine();
    
        //pass the String variable, SquareOrCircle though the parameters of the areas method
        areas(SquareOrCircle);
    
    }//end of main class

        //void method 
        //this is just for the intorduction and has no parameters or conditions and no value to return
        static void introduction() {
            System.out.println(
                "\n*********************************************************\n"
                +"*                                                       *\n"
                +"*      Welcome to the Area Calculator Program! ! !      *\n"
                +"*                                                       *"
                + "\n*********************************************************\n");
          }
        

          //this is a String method, so it will return a String
          static String areas(String SquareOrCircle){


            
           return"";
        }


            



}//end of package
