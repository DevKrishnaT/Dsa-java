package Hashing.revision;

import java.util.*;

public class groupAnagram {
    static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> ans = groupAnagrams(strs);
        System.out.println(ans);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String curr = new String(arr);
            if (!map.containsKey(curr)) {
                map.put(curr, new ArrayList<>());
            }
            map.get(curr).add(s);
        }
        for (Map.Entry<String, ArrayList<String>> keySte : map.entrySet()) {
            ans.add(keySte.getValue());
        }

        return ans;
    }
}
