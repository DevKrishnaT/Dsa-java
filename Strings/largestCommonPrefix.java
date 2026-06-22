package Strings;

public class largestCommonPrefix {
    static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String ans = LargestFind(strs);
        System.out.println(ans);
    }

    private static String LargestFind(String[] strs) {
        String largets = strs[0];
        
        int endindex = largets.length() - 1;
        for (int i = 1; i < strs.length; i++) {
            String curr = strs[i];
            int j = 0;
            while (endindex >= j && curr.length() > j && curr.charAt(j) == largets.charAt(j)) {
                j++;
            }
            endindex = j - 1;

        }
        return largets.substring(0, endindex + 1);
    }
}
