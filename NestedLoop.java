public class NestedLoop {
    public static void main(String[] args) {

        for (int i = 0; i <5; i++){
            System.out.println("Start of i " +i);

            for (int j =0; j<4; j++){
                System.out.println("j: " +j);
            }
            System.out.println("End of i " +i);

        }
    }
}
