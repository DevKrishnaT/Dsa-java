package Dynamic_Programming;

public class Ninjatechnique {
    static void main(String[] args) {
        int[][] mat = {{1, 2, 5},
                {3, 1, 1},
                {3, 3, 3}};
        int ans = MaximumPoints(mat);
        System.out.println(ans);
    }

    private static int MaximumPoints(int[][] mat) {
        int n = mat.length;
        return calulate(mat, n - 1, 3);
    }

    private static int calulate(int[][] mat, int n, int i) {
        if (n == 0) {
            int maxi = 0;
            for (int j = 0; j < 3; j++) {
                if (j != i) {
                    maxi = Math.max(maxi, mat[n][j]);
                }
            }
            return maxi;
        }
        int maxi = 0;

        for (int tark = 0; tark < 3; tark++) {
            if (tark != i) {
                int marit = mat[n][tark] + calulate(mat, n - 1, tark);

                maxi = Math.max(maxi, marit);
            }
        }
        return maxi;
    }
}
