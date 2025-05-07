import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");

        String s = sc.nextLine();
        String rev = "";
        
        int len = s.length();
        for(int i = len-1; i >= 0; i--) {
            rev += s.charAt(i);
        }

        System.out.println("Reversed string: "+rev);

    }
}
