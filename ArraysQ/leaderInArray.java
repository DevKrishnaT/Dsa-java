package ArraysQ;

import java.util.ArrayList;

public class leaderInArray {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                list.add(arr[i]);
            }
        }
        list.add(arr[arr.length - 1]);
        System.out.println(list);
    }
}
