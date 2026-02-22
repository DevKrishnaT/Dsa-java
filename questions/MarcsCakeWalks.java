package questions;

import java.util.ArrayList;
import java.util.Comparator;

public class MarcsCakeWalks {
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(4);
        list.add(9);
        list.add(6);
        long ans = marcsCakewalk(list);
        long ans2 = marcsCakewalkNew(list);

    }

    private static long marcsCakewalkNew(ArrayList<Integer> calorie) {
        long ans = 0;

        calorie.sort((a, b) -> b - a);
        System.out.println(calorie);
        for (int i = 0; i < calorie.size() - 1; i++) {
            long item = calorie.get(i);
            System.out.println(item);
            item *= (long) Math.pow(2, i++);

            ans += item;
        }
        return ans;
    }

    private static long marcsCakewalk(ArrayList<Integer> calories) {
        long ans = 0;
        int power = 0;
        calories.sort(Comparator.comparingInt(a -> a));
        for (int i = calories.size() - 1; i >= 0; i--) {
            long item = calories.get(i);
            item *= (long) Math.pow(2, power++);
            ans += item;


        }

        return ans;

    }

}
