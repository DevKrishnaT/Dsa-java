package Graph;

import java.util.*;

public class LadderLengthII {
    class pair {
        List<String> list;
        String word;
        int num;

        pair(List<String> list, String word, int num) {
            this.list = list;
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
        Queue<List<String>> queue = new LinkedList<>();
        HashSet<String> visited = new HashSet<>(wordList);

        queue.add(Arrays.asList(beginWord));
        boolean found = false;
        while (!queue.isEmpty() && !found) {
            int size = queue.size();
            visited.clear();
            for (int i = 0; i < size; i++) {
                List<String> path = queue.poll();
                String word = path.getLast();
                char[] arr = word.toCharArray();
                for (int j = 0; j < arr.length; j++) {
                    char original = arr[j];
                    for (char c = 'a'; c <= 'z'; c++) {
                        if (c == original) continue;

                        arr[j] = c;
                        String newWord = new String(arr);

                        if (Lst.contains(newWord)) {
                            List<String> newPath = new ArrayList<>(path);
                            newPath.add(newWord);
                            if (newWord.equals(endWord)) {
                                ans.add(newPath);
                                found = true;
                            } else {
                                queue.add(newPath);
                            }
                        }
                    }

                    arr[j] = original;

                }
            }
            for (String w : visited) {
                Lst.remove(w);
            }

        }

        return ans;
    }
}
