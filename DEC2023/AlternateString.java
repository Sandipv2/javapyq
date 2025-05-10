import java.util.Scanner;

public class AlternateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();

        for(int i = 0; i < s.length(); i += 2) {
            char ch = s.charAt(i);
            System.out.print(ch);
        }
    }
    /*
     * Eg.
     * abcde --> ace
     */
}