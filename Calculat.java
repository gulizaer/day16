import java.util.Scanner;

public class Calculat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        double radius = input.nextDouble();
        double Diameter,Area,Perimeter;// sonra kullanacagimiz ondalik degerleri simdiden atiyoruz
        double p = 3.14;

        String answer = "yes";

        if (radius<=0){
            System.err.println("Invalid Entry for the radius of the circle");
             System.exit(1);
    }
        while (answer.equals("yes") && radius>0){//bu dongu kullanici yes verdigi surece sinirsiz islemeye devam eder.
            Diameter = 2 * p; // capi hesaplamak.
            Perimeter= 2 * p * radius;//Cevreyi hesaplamak.
            Area= p * radius * radius;//Alani hesaplamak.

            System.out.println("Diameter: " + Diameter);
            System.out.println("Perimeter: " + Perimeter);
            System.out.println("Area: " + Area);

            System.out.println("Would you like to calculate another circle?");
            answer=input.next();

            while (!(answer.equals("yes") || (answer.equals("no")))){// yes yada no yazisindan baska biseyler yazip sacmalarsa
                                                                   // kullanici,sistem uyarir,yani yes ile no boylece sabitlenmis oldu.
                                                                   // kullanicinin baska bisey yazma hakkini elinden aliyoruz.
                System.err.println("Envalid entry, Would you like to calculate another circle?");
                answer=input.next();
            }
            if (answer.equals("yes")){//kullanici yes yazarsa bir ustteki donguye gider
                                      // ve ordaki formatta dongu yeniden hesaplamaya baslar
                System.out.println("Enter the radius of the circle:");
                radius=input.nextDouble();

            }else {// else den kasit no, kullaniciya sadece 2 secenek vermistik, ya yes yada no,
                 // yes olayi yukarida gectigi icin,nodan else diye bahsedersek sikinti olmaz,kod kisa, oz, duzenli olur.
                System.out.println("Thank you for using Cydeo Circle Calculator APP");// madem no sectin , tesekkurler byby.
            }
    }
        input.close();// cikarkende kapilari kapatiyoruz,eve ruzgar kacmasin ;)

        /*
         Write a program that can calculate the area and perimeter of a circle:
             1. Ask the user "Enter the radius of the circle:"
                if user enters 0 or negative numbers, terminate the program after
                displaying the error message "Invalid Entry for the radius of the circle"

            2. Display:
                1. Diameter of circle
                2. Area of circle
                3. Perimeter of circle

           3. Ask the user "Would you like to calculate another circle?"
                 If "yes" --> repeat the previous steps
                 If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"
                 If user enters an invalid entry, ask the user to re-enter until user provides a valid entry


                 Hint: you can use  System.exit(1) to terminate the entire program
         */
    }
}
