package lesson_1.ArraysQ;

import java.util.ArrayList;
import java.util.List;

public class MajorityElemntOptimal {
    public static void main(String[] args) {
        int[] arr = {1};
        List<Integer> list = MajorityElement(arr);
        System.out.println(list);
    }

    private static List<Integer> MajorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;

        int first = 0;
        int firstCount = 0;
        int sec = 0;
        int SecCount = 0;

        for (int num : nums) {
            if (firstCount > 0 && num == first) {
                firstCount++;
            } else if (SecCount > 0 && num == sec) {
                SecCount++;
            } else if (firstCount == 0) {
                first = num;
                firstCount = 1;
            } else if (SecCount == 0) {
                sec = num;
                SecCount = 1;
            } else {
                firstCount--;
                SecCount--;
            }

        }
        int Count1 = 0;
        int Count2 = 0;
        for (int num : nums) {
            if (num == first) Count1++;
            else if (num == sec) Count2++;


        }
        if (Count1 > n / 3) list.add(first);
        if (Count2 > n / 3) list.add(sec);
        return list;
    }
}
