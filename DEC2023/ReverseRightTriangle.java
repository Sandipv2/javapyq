public class ReverseRightTriangle {
    public static void main(String[] args) {
        int n = 5;

        for(int i = n; i >= 1; i--) {
            for(int s = n; s > i; s--) {
                System.out.print(" ");
            }

            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
