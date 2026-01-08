package lesson_1.questions.basic_q.BasicMathsq;

import java.util.ArrayList;
import java.util.Iterator;

public class armsStrong {
    public static void main(String[] args) {
        int n = 10;
        int check = n;
        int arm = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        while (n > 0) {
            arr.add(n % 10);
            n /= 10;
        }

        Iterator<Integer> itr = arr.iterator();
        int size = arr.size();
        while (itr.hasNext()) {
            int temp = itr.next();

            itr.remove();

            temp = (int) (Math.pow(temp, size));

            arm += temp;


        }

        if (check == arm) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
