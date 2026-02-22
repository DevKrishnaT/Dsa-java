package BinarySearch;

public class NthRoot {
    public static void main(String[] args) {
        int M = 27;
        int N = 3;
        int left = 0;
        int right = M;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int NPow = (int) Math.pow(mid, N);

            if (NPow > M) {
                right = mid - 1;
            } else if (NPow < M) {
                left = mid + 1;
            } else {
                System.out.println(NPow);
                break;
            }
        }
        System.out.println(-1);
    }
}
