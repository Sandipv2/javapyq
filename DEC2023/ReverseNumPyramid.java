public class ReverseNumPyramid {
    public static void main(String[] args) {
        int n = 7; 

        for(int i = 1; i <= n; i++) {
            for(int s = 1; s <= i-1; s++) {
                System.out.print(" ");
            }

            for(int j = i; j <= n; j++) {
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}
