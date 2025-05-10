import java.util.Scanner;
public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter string: ");
        String s = sc.nextLine();

        String result = "";

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isLowerCase(ch)) {
                result += Character.toUpperCase(ch);
            } else {
                result += Character.toLowerCase(ch);
            }
        }

        System.out.println(result);
    }
}
