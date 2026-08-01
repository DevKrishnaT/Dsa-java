package Hashing;

import java.util.*;

public class GroupAnagram {
    static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> ans = groupAnagrams(strs);
        System.out.println(ans);
    }

    private static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] sorted = s.toCharArray();
            Arrays.sort(sorted);
            String key = new String(sorted);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);

        }

        for (Map.Entry<String, ArrayList<String>> Itr : map.entrySet()) {
            ans.add(Itr.getValue());
        }


        return ans;

    }
}
