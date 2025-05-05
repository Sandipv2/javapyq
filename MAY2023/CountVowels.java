import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        String s1 = args[0];

        int vowelCount = 0;

        for(char ch : s1.toLowerCase().toCharArray()) {
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Vowels Count: "+vowelCount);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String s2 = sc.nextLine();

        String result = s2 + s1;
        System.out.println("Concatenated string: "+result);
    }
}
