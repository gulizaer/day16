import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "";
       String name1 = "";

       int attampt = 4;

        do {
            System.out.println("Enter the name");
           name = input.next();

            System.out.println("inter the number");
            name1 = input.next();

            attampt--;
            break;


        }
        while (!(name.equals("Cydeo") && name1.equals(123456)));


    }
}