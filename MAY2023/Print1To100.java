public class Print1To100 {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++) {
            System.out.println(i + " " + i*i + " " + i*i*i);
        }
    }
}
/*Output:
1 1 1
2 4 8
3 9 27
4 16 64
5 25 125
and so on...*/