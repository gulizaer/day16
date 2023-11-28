import java.util.Scanner;

public class calculatRectengel {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the Rectangle:");
        int length = input.nextInt();

        System.out.println("Enter the width of the Rectangle:");
        int width = input.nextInt();

        int Area,Perimeter;
        String answer="yes";


        if (length<=0 || width<=0){
            System.err.println("Invalid Entry for the length of the rectangle");
            System.exit(1);
        }

        while (length>0 && width>0 && answer.equals("yes") ){
            Area = length*width;
            Perimeter = (length*2)+(width*2);

            System.out.println("Area: "+Area);
            System.out.println("Perimeter: " +Perimeter);

            System.out.println("Would you like to calculate another Rectangle?");
            answer=input.next();

            while (!(answer.equals("yes") || answer.equals("no"))){
                System.out.println("Invalid entry, re-enter please! yes/no");
                answer=input.next();
            }
            if (answer.equals("yes")){
                System.out.println("Enter the length of the Rectangle:");
                length = input.nextInt();

                System.out.println("Enter the width of the Rectangle:");
                width = input.nextInt();

            }else {
                System.out.println("Thank you for using Cydeo Rectangle Calculator APP");
            }
        }
        input.close();



/*
 Write a program that can calculate the area and perimeter of a Rectangle:
 1. Ask the user "Enter the length of the Rectangle:"
    if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the length of the rectangle"

 2. Ask the user "Enter the width of the Rectangle:"
    if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the width of the rectangle"

 3. Display:
    1. Area of rectangle
    2. Perimeter of rectangle

 4. Ask the user "Would you like to calculate another Rectangle?"
    If "yes" --> repeat the previous steps
    If "No" --> Print "Thank you for using Cydeo Rectangle Calculator APP"

    If user enters an invalid entry, ask the user to re-enter until user provides a valid entry

    Hint: you can use  System.exit(1) to terminate the entire program
 */
    }
}
