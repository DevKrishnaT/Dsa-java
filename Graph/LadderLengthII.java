package Graph;

import java.util.*;

public class LadderLengthII {
    class pair {
        String word;
        int num;

        pair(String word, int num) {
            this.word = word;
            this.num = num;
        }
    }

    void main(String[] args) {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = new ArrayList<>(Arrays.asList("hot", "dot", "dog", "lot", "log", "cog"));
        List<List<String>> ans = ladderLengthII(beginWord, endWord, wordList);
        System.out.println(ans);
    }

    private List<List<String>> ladderLengthII(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> Lst = new HashSet<>(wordList);
        List<List<String>> ans = new ArrayList<>();
        if (!Lst.contains(endWord)) return ans;
        Queue<LadderLength.pair> queue = new LinkedList<>();

        queue.add(new LadderLength.pair(beginWord, 1));

        ArrayList<String> comp = new ArrayList<>();
        int num = Integer.MAX_VALUE;
        while (!queue.isEmpty()) {
            LadderLength.pair curr = queue.poll();
            comp.add(curr.word);
            if (Objects.equals(curr.word, endWord) && num >= curr.num) {
                num = curr.num;
                ans.add(new ArrayList<>(comp));
            }

            char[] arr = curr.word.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                char original = arr[i];
                for (char c = 'a'; c <= 'z'; c++) {
                    if (c == original) continue;
                    arr[i] = c;

                    String newWord = new String(arr);

                    if (Lst.contains(newWord)) {
                        queue.add(new LadderLength.pair(newWord, curr.num + 1));
                        Lst.remove(newWord);
                    }
                }
                arr[i] = original;
            }

        }

        return ans;

    }
}
