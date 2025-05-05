public class XPattern {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 0; i < n*2-1; i++) {
            for(int j = 0; j < n*2-1; j++) {
                if(i == j || i+j == n*2-2) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
