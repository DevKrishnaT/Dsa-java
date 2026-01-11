package lesson_1.ArraysQ;

public class SeachInArray {
    public static void main(String[] args) {
        int[] arr = {12, 2, 235, 23, 4124, 312, 312, 412, 45123, 523, 523, 512, 412, 412};
        int num = 4124;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                System.out.println(i);
                break;
            }


        }
        System.out.println(-1);
    }
}
