import java.util.Scanner;

public class calculat2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the side of the square:");
        int side = input.nextInt();

        int Area,Perimeter;
        String answer= "yes";

        if (side<=0){
            System.err.println("Invalid Entry for the side of the square");
            System.exit(1);
        }
        while (side>0 && answer.equals("yes")){
            Area = side*side;
            Perimeter=side+side+side+side;

            System.out.println("Area: "+Area);
            System.out.println("Perimeter: "+Perimeter );

            System.out.println("Would you like to calculate another Square?");
            answer=input.next();

            while (!(answer.equals("yes")|| answer.equals("no"))){
                System.out.println("Invalid entry, re-enter please! yes/no");
                answer=input.next();

            }
            if (answer.equals("yes")){
                System.out.println("Enter the side of the square:");
                side=input.nextInt();

            }else {
                System.out.println("Thank you for using Cydeo Square Calculator APP");
            }
        }
        input.close();

 /*
  Write a program that can calculate the area and perimeter of a Square:
   1. Ask the user "Enter the side of the square:"
       if user enters 0 or negative numbers, terminate the program after displaying
        the error message "Invalid Entry for the side of the square"

   2. Display:
      1. Area of square
      2. Perimeter of square

   3. Ask the user "Would you like to calculate another Square?"
      If "yes" --> repeat the previous steps
      If "No" --> Print "Thank you for using Cydeo Square Calculator APP"

      If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

       Hint: you can use  System.exit(1) to terminate the entire program


  */
    }
}
