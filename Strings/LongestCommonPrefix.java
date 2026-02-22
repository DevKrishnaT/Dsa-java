package Strings;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] s = {"dog", "racecar", "car"};

        String ans = longestCommonPrefix(s);

        System.out.println(ans);
    }

    private static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;

    }
}
