package lesson_1.collection_framework;

import java.util.Vector;

public class vector {

    public static void main(String[] args) {
        Vector<Integer> v1 = new Vector<>();
        System.out.println(v1.capacity());
        v1.add(3);
        v1.add(9);
        v1.add(6);
        v1.add(5);

        System.out.println(v1);
        System.out.println(v1);

    }
}
