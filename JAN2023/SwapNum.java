public class SwapNum {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;

        // Using 3rd variable
        int temp = a;
        a = b;
        b = temp;

        // Without using 3rd varible
        // a = a + b;
        // b = a - b;
        // a = a - b;

        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}