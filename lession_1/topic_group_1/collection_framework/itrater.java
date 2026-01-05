package lession_1.topic_group_1.collection_framework;

import com.sun.source.tree.WhileLoopTree;

import java.util.ArrayList;
import java.util.Iterator;

public class itrater {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();

        array.add(29);
        array.add(234);
        array.add(34);
        array.add(845);
        array.add(79);
        array.add(24);
        array.add(35);
        Iterator<Integer> Itrate = array.iterator();
        while (Itrate.hasNext()) {
            System.out.println(Itrate.next());

        }
    }
}
