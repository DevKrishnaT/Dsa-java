package test.FuntionFile;

public class Power {
    public int power(int number, int Power) {
        int ans = number;
        for (int i = 1; i < Power; i++) {
            ans *= number;
        }

        return ans;
    }
}
