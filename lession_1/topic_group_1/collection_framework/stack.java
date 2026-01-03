package lession_1.topic_group_1.collection_framework;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> S1 = new Stack<>();
        S1.push(10);
        S1.push(20);
        S1.push(30);

        Integer S2 =  S1.peek();
        System.out.println(S2);

        System.out.println(S1.search(20));

        System.out.println(S1.size());
    }
}
