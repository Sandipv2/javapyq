import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int n = sc.nextInt();

        int temp = n;
        int sum = 0;

        while(temp > 0) {
            int r = temp%10;
            sum = sum + (r*r*r);
            temp /= 10; // temp = temp/10;
        }

        if(sum == n) {
            System.out.println("Its Armstrong.");
        } else {
            System.out.println("Not Armstrong.");
        }
    }
}
