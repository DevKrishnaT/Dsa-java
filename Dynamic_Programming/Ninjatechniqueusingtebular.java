package Dynamic_Programming;

public class Ninjatechniqueusingtebular {
    static void main(String[] args) {
        int[][] mat = {{1, 2, 5},
                {3, 1, 1},
                {3, 3, 3}};
        int ans = MaximumPoints(mat);
        int ans2 = MaximumPointsSpace(mat);
        System.out.println(ans2);
        System.out.println(ans);
    }

    private static int MaximumPointsSpace(int[][] mat) {
        int n = mat.length;
        int[] prev = new int[4];
        prev[0] = Math.max(mat[0][1], mat[0][2]);
        prev[1] = Math.max(mat[0][0], mat[0][2]);
        prev[2] = Math.max(mat[0][0], mat[0][1]);
        prev[3] = Math.max(mat[0][0], Math.max(mat[0][1], mat[0][2]));
        for (int day = 1; day < n; day++) {
            int[] dummy = new int[4];
            for (int last = 0; last < 4; last++) {
                dummy[last] = 0;
                for (int task = 0; task < 3; task++) {
                    if (task != last) {

                        dummy[last] = Math.max(
                                dummy[last],
                                mat[day][task] + prev[task]);
                    }
                }
            }
            prev = dummy;
        }
        return prev[3];

    }

    private static int MaximumPoints(int[][] mat) {
        int n = mat.length;
        int[][] dp = new int[n][4];

        dp[0][0] = Math.max(mat[0][1], mat[0][2]);
        dp[0][1] = Math.max(mat[0][0], mat[0][2]);
        dp[0][2] = Math.max(mat[0][0], mat[0][1]);
        dp[0][3] = Math.max(mat[0][0], Math.max(mat[0][1], mat[0][2]));

        for (int day = 1; day < n; day++) {
            for (int last = 0; last < 4; last++) {
                dp[day][last] = 0;
                for (int task = 0; task < 3; task++) {
                    if (task != last) {

                        int point = mat[day][task]
                                + dp[day - 1][task];

                        dp[day][last] =
                                Math.max(dp[day][last], point);
                    }
                }
            }
        }
        return dp[n - 1][3];
    }
}
