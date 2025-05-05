import java.util.Scanner;

public class FindClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter two nums: ");
        int a = in.nextInt();
        int b = in.nextInt();

        int lcm = Math.max(a, b);

        while(true) {
            if(lcm%a == 0 && lcm%b == 0) {
                System.out.println("The LCM is: "+lcm);
                break;
            }
            lcm++;
        }
    }
}