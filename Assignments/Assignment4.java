package Assignments;
// of java.lang.Math.sqrt() method
import java.util.Scanner;
import java.lang.Math;
public class Assignment4 {
    public static void main(String[] args){
        //import the scanner class to allow user input
        Scanner scan = new Scanner(System.in);

        // intilaze and declare all need variables
        double x=10, MidtermGrade,FinialGrade,ProjectGrade, AverageGrade;
        String InputGrades = null,StudentName, CourseName, MoreGrades = null;

        // step 1
        // show the square roots for numbers 1 - 10

        //make a for loop that loops 9 times
        for (int i = 0; i <= 9; i++) {
            //display tot the console
            System.out.println("the square root of " + x + " is " + Math.sqrt(x)); 

            //decrement x every time the loop repeats
            x--;
        }//end of for loop

        // step 2

        //allow for user input(this way only accepts char input and will make any Stirng into a char variable)
        //we can use the .next() method from the scanner class. the next() method takes in an unspecified variable and with a infinite amount of characters
        //the charAt(). method allows us to specify storing only one single character into a char variable. 
        //the charAt() method only returns char variables and also converts any type of data type into a char variable
        //we have to concatnate 2 different methods together because the Scanner class do not support char input
        //InputGrades = scan.next().charAt(0);

        //this do while loop is to validate user input for the String variable, InputGrades
        //anything other the the letters y or n should hit the last else if staement and return to reprompt the user to enter the correct option
    do {

        //prompt the user
        System.out.print("\nStep 2: grading for multiple students\n\n" +
        "Would you like ot input grades? (y/n) : ");//the console must only acceapt y or n

        //allow for user input and store it into the String variable, Inputgrades
        InputGrades = scan.nextLine();

        //if statement that for if the user enters y, n, or the wrong option, accordingly
        //i decedied to use the .equalsIgnoresCase(); method to allow the user to enter a lowercase or uppercase and not loop 
        if(InputGrades.equalsIgnoreCase("y")){
        //thisis a do while loop for if the user wants to enter more grades


            do {

                //prompt user for the student name
                System.out.print("\nStudent Name : ");
                //allow for user input
                StudentName = scan.nextLine();

                //prompt the user for the students course name
                System.out.print("\nCourse Name : ");
                //allow for user input
                CourseName = scan.nextLine();

                //validate user input with a do while loop
                //a do whilie loop is perferred in this case becuase it will run the block of code first, as opposed to a wile loop that will need to check for a condition first
                //if the user enters a number greater then 100 or less then 0 we will ask them to enter a number between 100 - 0
                do {

                        //prompt the user
                        System.out.print("\nMidterm Grade (needs to between 0 - 100) : ");
                        //allow for user input
                        MidtermGrade = scan.nextInt();
                        
                } while (MidtermGrade > 100 || MidtermGrade < 0);//end of do while loop

                do {

                        //prompt the user
                        System.out.print("\nFinial Grade (needs to between 0 - 100) : ");
                        //allow for user input
                        FinialGrade = scan.nextInt(); 

                } while (FinialGrade > 100 || FinialGrade < 0);//end of do while loop

                do {
                
                        //prompt the user 
                        System.out.print("\nProject Grade (needs to between 0 - 100) : ");
                        //allow for user input
                        ProjectGrade = scan.nextInt(); 

                } while (ProjectGrade > 100 || ProjectGrade < 0);//end of do while loop

                //caluculate the average grade for the student
                AverageGrade = (MidtermGrade+ProjectGrade+FinialGrade) / 3 ;


                //display to the user on the console 
                if (AverageGrade >=90) {
                    System.out.println(StudentName+"'s grade is " + String.format("%.2f", AverageGrade) + ". this is equal to a A"+
                    "\nFeedback : Awesome Job ! ! ! ");
                } else if (AverageGrade>=80) {
                    System.out.println(StudentName+"'s grade is " + String.format("%.2f", AverageGrade) + ". this is equal to a B" +
                    "\nFeedback : Great job!!!");
                } else if (AverageGrade>=70) {
                    System.out.println(StudentName+"'s grade is " + String.format("%.2f", AverageGrade) + ". this is equal to a C"+
                    "\nFeedback : Good job");
                } else if (AverageGrade>=60) {
                    System.out.println(StudentName+"'s grade is " + String.format("%.2f", AverageGrade) + ". this is equal to a D" +
                    "\nFeedback : Study More :(");
                } else if (AverageGrade>=50) {
                    System.out.println(StudentName+"'s grade is " + String.format("%.2f", AverageGrade) + ". this is equal to a E"+
                    "\nFeedback : You failed the class :(");
                } else {
                    System.out.println(StudentName+"'s grade is " + String.format("%.2f", AverageGrade) + ". this is equal to a F"+
                    "\nFeedback : You Failed the class : (");
                }//end of elseif statement                            
                
            //prompt the user for more grades
            System.out.print("would you like to enter more grades ? ? ?(y/n) :");

            //clear the buffer in the scanner
            //in simple terms the buffer is what we call the scanner object which stores the variable that we are passing thoguh it
            //because we usually pass many variable and values in the scanner the buffer(scanner objects) can be overwhelmed/overwritten and stuck on the last input for the scanner object that was used
            //this simple line of code pushes the scanner store the next line of code enterd from the user in the console
            //this allows us to use the scanner in the line of code below it
            scan.nextLine();

            //allow user input            
            MoreGrades = scan.nextLine();


            } while (MoreGrades.equalsIgnoreCase("y"));//end of do while loop


        }
        else if(InputGrades.equalsIgnoreCase("n")){

            //end of the program
            System.out.println(("Thanks for using this program! ! ! ").toUpperCase());
        }
        else{

            //reprompt the user
            System.out.println("y/n neded :");

        }//end of elseif statement   
        
    } while(!InputGrades.equalsIgnoreCase("y") && !InputGrades.equalsIgnoreCase("n"));//end of do while loop

    //close the scanner class in java
    //If you do not close the Scanner then Java will not garbage collect the Scanner object and you will have a memory leak in your program
    scan.close();


    }//end of main class

}//end of package
