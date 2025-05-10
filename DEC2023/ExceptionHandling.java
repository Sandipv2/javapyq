import java.util.Scanner;

class NumberIsZeroException extends Exception {
    NumberIsZeroException(String s) {
        super(s);
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        String num = sc.next();

        try {
            if (!isNumeric(num)) {
                throw new Error("Number is invalid.");
            }

            int n = Integer.parseInt(num);

            if (n == 0) {
                throw new NumberIsZeroException("Number is Zero.");
            }

            if (isPallindrome(n)) {
                System.out.println("Its Pallindrome.");
            } else {
                System.out.println("Not Pallindrome.");
            }
        } catch (NumberIsZeroException e) {
            System.out.println(e.getMessage());
        } catch (Error e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean isNumeric(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    static boolean isPallindrome(int n) {
        int temp = n;
        int rev = 0;

        while (temp > 0) {
            int r = temp % 10;
            rev = (rev * 10) + r;
            temp = temp / 10;
        }

        if (rev == n)
            return true;

        return false;
    }
}
