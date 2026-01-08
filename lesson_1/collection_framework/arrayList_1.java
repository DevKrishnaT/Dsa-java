package lesson_1.collection_framework;

import java.util.ArrayList;
import java.util.Collections;


public class arrayList_1 {
    public static void main(String[] args) {
        ArrayList<Integer> A1 = new ArrayList<Integer>();

        // Array list add

        A1.add(38);
        A1.add(93);
        A1.add(5);
        A1.add(10);
        // add at specific location

        A1.add(1, 10);

        // set element

        A1.set(0, 10);

        // delete eol


        A1.remove(0);

        // to get the elment by th specific postion

        System.out.println("before");

        for (int i : A1) {
            System.out.println(i);
        }
        // to sort the array


        Collections.sort(A1);
        System.out.println("after");

        for (int i : A1) {
            System.out.println(i);
        }


    }
}
