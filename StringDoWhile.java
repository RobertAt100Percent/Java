import java.util.Scanner;

public class StringDoWhile {
    public static void main(String[] args){

            //import the scanner class to allo wuser input
        Scanner input = new Scanner(System.in);

    String InputGrades =null;
    do {
    //body

            //prompt the user
            System.out.print("\nStep 2: grading for multiple students\n\n" +
            "Would you like ot input grades? (y/n) : ");//the console must only acceapt y or n

    System.out.println("exit????");
    InputGrades= input.next(); // or input.nextLine();


    } while(!InputGrades.equalsIgnoreCase("y") && !InputGrades.equalsIgnoreCase("n"));


    System.out.println("exited");
}
    
}
