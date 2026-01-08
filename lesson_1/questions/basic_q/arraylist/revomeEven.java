package lesson_1.questions.basic_q.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class revomeEven {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList =
                new ArrayList<>(Arrays.asList(10, 20, 30, 40, 35, 124, 353, 12, 345, 232, 21));

        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(arrayList);
    }
}
