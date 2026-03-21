package Graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class FloodFill {
    static void main(String[] args) {
        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int sr = 1;
        int sc = 1;
        int color = 2;
        int[][] ans = floodFill(image, sr, sc, color);
        for (int[] n : ans) {
            System.out.println(Arrays.toString(n));
        }
    }

    private static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int rows = image.length;
        int cols = image[0].length;
        int pixelColor = image[sr][sc];
        if (pixelColor == color) return image;
        image[sr][sc] = color;
        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[]{sr, sc});
        int[][] dirs = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};
        while (!queue.isEmpty()) {

            int[] curr = queue.poll();
            for (int[] dir : dirs) {
                int ni = curr[0] + dir[0];
                int nj = curr[1] + dir[1];
                if (ni >= 0 && nj >= 0 && ni < rows && nj < cols && image[ni][nj] == pixelColor) {
                    image[ni][nj] = color;
                    queue.add(new int[]{ni, nj});
                }
            }

        }
        return image;
    }
}
