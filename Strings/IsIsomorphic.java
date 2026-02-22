package Strings;

public class IsIsomorphic {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        boolean ans = isIsomorphic(s, t);
        System.out.println(ans);
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] maps = new int[256];
        int[] mapt = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char chs = s.charAt(i);
            char cht = t.charAt(i);


            if (maps[chs] != mapt[cht]) {
                return false;
            }

            maps[chs] = i + 1;
            mapt[cht] = i + 1;

        }
        return true;
    }
}
