package BitManupulation;

public class Addition {
    static void main(String[] args) {
        int a = 10;
        int b = 8;
        int add = a + b;
        System.out.println(add);

        int ans = (a ^ b) + 2 * (a & b);
        System.out.println(ans);

        System.out.println((ans == add));
    }
}
