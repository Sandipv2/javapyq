import java.util.Scanner;

class NumberIsOutOfRangeException extends Exception{
    NumberIsOutOfRangeException(String s) {
        super(s);
    }
}

public class UserDefinedException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int n = sc.nextInt();

        try {
            if(n > 1000) {
                throw new NumberIsOutOfRangeException("Number is out of range.");
            } else {
                factors(n);
            }
        } catch (NumberIsOutOfRangeException e) {
            System.out.println(e.getMessage());
        }
    }

    static void factors(int num) {
        System.out.println("Factors of "+num);
        for(int i = 1; i <= num; i++) {
            if(num % i == 0) {
                System.out.println(i);
            }
        }
    } 
}
