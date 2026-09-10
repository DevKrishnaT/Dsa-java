package RecursionAgain.Basic;

public class Factorial {
    static void main(String[] args) {
        int ans = find(8);
        System.out.println(ans);
    }

    private static int find(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }


        return num * find(num - 1);
    }
}
