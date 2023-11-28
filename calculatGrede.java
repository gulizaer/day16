import java.util.Scanner;

public class calculatGrede {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score");
        int score = input.nextInt();



        String answer="yes";

        if (score<0 || score>100){
            System.err.println("Invalid Entry!");
            System.exit(1);
        }
        while (score>0 && score<100 && answer.equals("yes")) {
            if (score >= 90 && score <= 100){
                System.out.println("A");
            }
            else if (score >= 80 && score <= 89){
                System.out.println("B");
            }
            else if (score >= 70 && score <= 79) {
                System.out.println("C");
            }
            else if (score >= 60 && score <= 69) {
                System.out.println("D");
            }
            else  {
                System.out.println("F");
            }

            System.out.println(" would you like to continue");
            answer=input.next();

            while (!(answer.equals("yes")|| answer.equals("no"))){
                System.err.println("Invalid Entry! ");
                System.exit(1);



            }if (answer.equals("yes")){
                System.out.println("Enter your score");
                score = input.nextInt();
            }else {
                System.out.println("Thank you for using Cydeo Grade Calculator APP");
            }
        }
        input.close();



 /*
 Write a program for grade calculator:
 1. Ask the user "Enter your score"
    If user enters invalid score, terminate the program after displaying the error message "Invalid Entry"

 2. Display the grade of the student.
                         90 ~ 100 ==> A
                         80 ~ 89 ==> B
                         70 ~ 79 ==> C
                         60 ~ 69 ==> D
                          0 ~ 59 ==> F

 2. Ask the user would you like to continue
    If "yes" --> repeat the previous steps
    If "no" --> print "Thank you for using Cydeo Grade Calculator APP"

   If user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"


                 Hint: you can use  System.exit(1) to terminate the entire program
  */
    }
}
