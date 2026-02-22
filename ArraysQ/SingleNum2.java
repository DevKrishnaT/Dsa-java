package ArraysQ;

public class SingleNum2 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 1, 99};
        int left = 0;
        int right = 1;
        while (left < right && right > arr.length - 1) {
            if (arr[left] == arr[right]) {
                left++;
                right++;
            } else {
                right++;
            }
        }
        System.out.println(arr[left]);
    }
}
