import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and width: ");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        
        double area = l*w;

        System.out.println("The Area of rectangle is: "+area);
    }
}
