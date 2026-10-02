package RecursionAgain.RealQ;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    static void main(String[] args) {
        String s = "aab";
        List<List<String>> ans = partition(s);
        System.out.println(ans);
    }

    private static List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
        findPlaindromes(list, s, new StringBuilder(), 0, new ArrayList<>());
        return list;
    }

    private static void findPlaindromes(List<List<String>> list, String s, StringBuilder palindrome, int idx, List<String> palindromes) {
        if (idx == s.length()) {
            list.add(new ArrayList<>(palindromes));
            return;
        }
        for (int i = idx; i < s.length(); i++) {
            palindrome = new StringBuilder(s.substring(idx, i + 1));

            if (isPalindrome(palindrome)) {
                palindromes.add(palindrome.toString());
                findPlaindromes(list, s, palindrome, i + 1, palindromes);
                palindromes.remove(palindromes.size() - 1);
            }
        }
    }

    private static boolean isPalindrome(StringBuilder s) {
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
