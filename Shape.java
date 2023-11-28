public class Shape {
    public static void main(String[] args) {
        Shape shape = new Shape();
        drawshape();

    }

    public static void drawshape(){

        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
