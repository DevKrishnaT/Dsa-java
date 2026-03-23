package Graph;

import javabasic.strings.Strings;

import java.util.*;

public class LadderLength {
    static class pair {
        String word;
        int num;

        pair(String word, int num) {
            this.word = word;
            this.num = num;
        }
    }

    static void main(String[] args) {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = new ArrayList<>(Arrays.asList("hot", "dot", "dog", "lot", "log", "cog"));
        int ans = ladderLength(beginWord, endWord, wordList);
        System.out.println(ans);
    }

    private static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> Lst = new HashSet<>(wordList);
        if (!Lst.contains(endWord)) return 0;
        Queue<pair> queue = new LinkedList<>();

        queue.add(new pair(beginWord, 1));


        while (!queue.isEmpty()) {
            pair curr = queue.poll();
            if (Objects.equals(curr.word, endWord)) {
                return curr.num;
            }

            char[] arr = curr.word.toCharArray();


            for (int i = 0; i < arr.length; i++) {
                char original = arr[i];
                for (char c = 'a'; c <= 'z'; c++) {
                    if (c == original) continue;
                    arr[i] = c;
                    
                    String newWord = new String(arr);

                    if (Lst.contains(newWord)) {
                        queue.add(new pair(newWord, curr.num + 1));
                        Lst.remove(newWord);
                    }
                }
                arr[i] = original;
            }

        }

        return 0;


    }
}
