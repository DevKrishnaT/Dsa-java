package lesson_1.BitManupulation;

import java.util.BitSet;

public class CountPrime {
    static void main(String[] args) {
        int n = 10;
        int ans = countPrimes(n);
        System.out.println(ans);
    }

    private static int countPrimes(int n) {
        if (n <= 2) return 0;
        BitSet isPrime = new BitSet(n);

        isPrime.set(2, n);

        for (int i = 2; i * i < n; i++) {
            if (isPrime.get(i)) {
                for (int j = i * i; j < n; j += i) {
                    isPrime.clear(j);

                }
            }

        }
        
        return isPrime.cardinality();
    }
}
