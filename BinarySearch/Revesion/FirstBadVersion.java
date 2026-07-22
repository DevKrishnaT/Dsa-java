package BinarySearch.Revesion;

public class FirstBadVersion {
    static void main(String[] args) {
        int n = 5;

        int ans = firstBadVersion(n);
        System.out.println(ans);
    }

    private static int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (isBadVersion(mid)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    private static boolean isBadVersion(int mid) {
        return mid > 3;
    }
}
