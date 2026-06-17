package ArraysQ;

public class LargetCommonprefix {
    static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String ans = largets(strs);
    }

    private static String largets(String[] strs) {
        String common = strs[0];

        for (int i = 1; i < strs.length; i++) {
            String curr = strs[i];

            int j = 0;
            while (j < common.length() &&
                    j < curr.length() &&
                    common.charAt(j) == curr.charAt(j)) {
                j++;
            }

            common = common.substring(0, j);

            if (common.isEmpty()) {
                return "";
            }


        }
        return common;
    }
}
