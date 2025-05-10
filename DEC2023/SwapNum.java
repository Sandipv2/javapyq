import java.util.Scanner;
public class SwapNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num for a and b : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapped:");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}
