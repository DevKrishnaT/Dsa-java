package lesson_1.collection_framework;

import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> L1 = new LinkedList<>();
        LinkedList<Integer> L2 = new LinkedList<>();
// to add
        L1.add(10);
        L1.add(25);
        L1.add(40);

//to get
        System.out.println(L1.get(1));


        L1.addFirst(0);
        L1.addFirst(20);
        L1.addLast(30);

        System.out.println(L1.getFirst());
        Object copy = L1.clone();
        System.out.println(copy);

        L1.removeIf(x -> x % 2 != 0);
        System.out.println(L1);
    }

}
