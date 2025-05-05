import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Interest Rate: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Years: ");
        int time = sc.nextInt();

        double amount = principal * Math.pow((1 + rate / 100), time);
        double ci = amount - principal;

        System.out.printf("The compound interest is: %.2f",ci); // 40.22
        // System.out.println("The compund interest is: "+ci); // 40.22212112121
    }
}
