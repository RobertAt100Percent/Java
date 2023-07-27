package Assignments;

import java.util.Scanner;
import java.lang.Math;

public class Assignment5 {
        public static void main(String[] args){
        //call the introduction(); method
        introduction();

        //call the addingGame(); method
        addingGame();

        //call the square(); method
        squares();


        }//end of main class

        //void method 
        //this is just for the intorduction and has no parameters or conditions and no value to return
        static void introduction() {
            System.out.println(
                "\n*********************************************************\n"
                +"*                                                       *\n"
                +"*  Part 1: Welcome To The Creating Methods Program!!!   *\n"
                +"*                                                       *"
                + "\n*********************************************************\n");
          }


          static void addingGame(){
        System.out.println("****************Part 2: Adding Numbers*******************");
        //import the scanner class for user input
        Scanner scan = new Scanner(System.in);
        //initalize and declare all needed variables
        //even tho we do not use the initialized value of null for the strings it is good progamming pratice to initalize all variables
        //for example in the programming lanaguage C# we can not use uninitalized variables, and in other lanaguages it leaves memeory leaks and unrepoducable errors
        //inializing variables basically minimize the chance of a bug happening because we know wha the defalut value of the variable is
        //null (for Strings and char) and 0 (for any number variable) are always good for initalization if we're going to not use the value anyway
        //these errors are more profound in non-primitave, reference type variables
        String YesOrNo = null, PlayAgain = null;

        //prompt the user
        System.out.print("Add some numbers? (y/n): ");
        
        //allow for user input
        YesOrNo = scan.nextLine();

        if (YesOrNo.equalsIgnoreCase("y")) {
                    do {
                    //make a math question with some random numbers using the random(); method from the Math class
        int a = (int)(Math.random() * 101);  // 0 to 100
        int b = (int)(Math.random() * 101);  // 0 to 100
        int UserAnswer, RealAnswer = a + b;

        //display equation to the user
        System.out.print(a + " + " + b + " = ");

        //allow for user input
            UserAnswer = scan.nextInt();

            //if statement for if the user enters the correct answer or not
            if (UserAnswer == RealAnswer) {
                System.out.println("Correct!!!" + UserAnswer+ " is the right answer");
            } else {
                System.out.println("Sorry the correct answer is " + RealAnswer);   
            }

            //prompt the user
            System.out.println("Do you want to play again?(y/n)");

        //allow for user input
                scan.nextLine();

        PlayAgain = scan.nextLine();
        } while (PlayAgain.equalsIgnoreCase("y"));

                    System.out.println("thanks - lets move on to part 3 . . . \n");


        } else if(YesOrNo.equalsIgnoreCase("n")) {
            System.out.println("thanks - lets move on to part 3 . . . \n");
        }

          }

          static void squares(){
            int x = 2;
        System.out.println("****************Part 3: Squaring Numbers*******************");

            for (int i = 0; i < 12; i++) {
                System.out.println(x + " squared is " + Math.pow(x,2));
                x=x+2;
            }

          }



    }//end of package
