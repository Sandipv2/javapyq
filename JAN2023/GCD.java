import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two nums: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int min = Math.min(a, b);
        int gcd = 1;

        for(int i = 1; i <= min; i++) {
            if(a%i == 0 && b%i == 0) {
                gcd = i;
            }
        }

        System.out.println("The GCD is: "+gcd);
    }
}
