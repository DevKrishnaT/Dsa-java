package twoPointer.Revision.revison;

public class SsPalindrome {
    static void main(String[] args) {
        String s = "Was it a car or a cat I saw?";
        boolean ans = isPalindrome(s);
        System.out.println(ans);
    }

    private static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();


        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
