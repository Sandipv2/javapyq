import java.util.Scanner;

public class DecimalToHex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        String hexDigits = "0123456789ABCDEF";
        String ans = "";

        while(n > 0) {
            int r = n%16;
            ans = hexDigits.charAt(r) + ans;
            n /= 16;
        }

        System.out.println(ans);
    }
}
