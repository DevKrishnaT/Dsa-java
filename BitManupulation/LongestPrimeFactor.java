package BitManupulation;

public class LongestPrimeFactor {
    static void main(String[] args) {
        int n = 13195;

        long ans = largestPrimeFactor(n);
        System.out.println(ans);
    }

    private static long largestPrimeFactor(int n) {
        int maxPrime = -1;

        while (n % 2 == 0) {
            maxPrime = 2;
            n = n / 2;
        }

        for (int i = 3; i * i < n; i += 2) {
            while (n % i == 0) {
                maxPrime = i;
                n /= i;
            }

        }
        if (n > 1) {
            maxPrime = n;
        }
        return maxPrime;
    }
}
