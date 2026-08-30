package QuickRevision;

public class IsPalindrome {
    static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean ans = isPalindrome(s);
        System.out.println(ans);
    }

    private static boolean isPalindrome(String s) {
        s = s.toLowerCase();

        s = s.replaceAll("[^a-z0-9]", "");


        StringBuilder rev = new StringBuilder(s);

        return rev.reverse().toString().equals(s);
    }
}
