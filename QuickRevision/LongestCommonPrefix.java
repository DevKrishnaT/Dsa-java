package QuickRevision;

public class LongestCommonPrefix {
    static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String ans = longestCommonPrefix(strs);
        System.out.println(ans);
    }

    private static String longestCommonPrefix(String[] strs) {
        String largest = strs[0];

        int endIndex = largest.length() - 1;

        for (int i = 1; i < strs.length; i++) {
            String curr = strs[i];
            int j = 0;
            while (endIndex >= j && curr.length() > j && curr.charAt(j) == largest.charAt(j)) {
                j++;
            }
            endIndex = j - 1;
        }

        return largest.substring(0, endIndex + 1);
    }
}
