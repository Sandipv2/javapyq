public class Pallindrome {
    public static void main(String[] args) {
        int n = 121; // U can take input from user.
        int temp = n;
        int rev = 0;

        while(temp > 0) {
            int r = temp%10;
            rev = (rev * 10) + r;
            temp = temp / 10;
        }

        if(rev == n) {
            System.out.println("Its Pallindrome");
        } else {
            System.out.println("Its Not Pallindrome.");
        }
        
    }
}
