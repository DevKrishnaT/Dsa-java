package Strings;

public class LongestPrefix {
    static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String ans = longestCommonPrefix(strs);
        System.out.println(ans);
    }

    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        int endIndex = prefix.length() - 1;

        for (int i = 1; i < strs.length; i++) {
            String curr = strs[i];
         

            int j = 0;
            while (endIndex >= j && curr.length() > j && prefix.charAt(j) == curr.charAt(j)) {
                j++;
            }
            endIndex = j - 1;

        }

        return prefix.substring(0, endIndex + 1);

    }
}
