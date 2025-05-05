import java.util.Scanner;

public class ConeVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Height and Radius(in CMs): ");
        float h = sc.nextFloat();
        float r = sc.nextFloat();

        float volume = (1/3f) * 3.14f * r * r * h;

        System.out.println("The Cone Volume is: "+volume);
    }
}
