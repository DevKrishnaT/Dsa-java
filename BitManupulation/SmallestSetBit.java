package BitManupulation;

public class SmallestSetBit {
    static void main(String[] args) {
        int n = 5;
        int ans = smallest(n);
        System.out.println(ans);
        System.out.println(ans);
    }

    private static int smallest(int n) {
        int k = 1;
        while (true) {
            int num = (1 << k) - 1;
            if (num >= n) {
                return num;
            }
            k++;
        }
    }
}
