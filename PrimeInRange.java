public class PrimeInRange {
    public static void main(String[] args) {

        int number = 50; // ending point

        for (int i = 2; i<=number; i++){ // this loop goes through every number from 2 - ending
            boolean isPrime = true; // in the outer loop, it is reset everytime the outer loop

            for (int j = 2; j < i; j++){
                //System.out.println("i%j" + i + " " +j+ " " + (i%j));
                if (i % j == 0){//the number was divisible by another number that was not 1 or itself
                    isPrime = false;
                    break; // Stops the inner loop.

                }

            }
            if (isPrime){
                System.out.print(i+ " ");
            }


        }



    }

}
