import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num: ");
        int n = sc.nextInt();

        int sum = 0;
        while(n > 0) {
            int r = n%10;
            sum += r; // sum = sum + r;
            n /= 10; // n = n/10;
        }

        System.out.println("Digits sum: "+sum);
    }
}
