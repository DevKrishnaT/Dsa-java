package ArraysQ;

public class InversionPair {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        long inversions = mergeSort(arr, 0, arr.length - 1);


    }


    public static long mergeSort(int[] arr, int left, int right) {
        if (left >= right) return 0;
        int mid = left + (right - left) / 2;

        long inversions = 0;
        inversions += mergeSort(arr, left, mid);
        inversions += mergeSort(arr, mid + 1, right);


        inversions += merge(arr, left, mid, right);
        return inversions;

    }

    public static long merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        long inversions = 0;
        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) temp[k++] = arr[i++];
            else {
                temp[k++] = arr[j++];
                inversions += (mid - i + 1);
            }
        }
        while (j <= right) temp[k++] = arr[j++];
        while (i <= mid) temp[k++] = arr[i++];
        System.arraycopy(temp, 0, arr, left, temp.length);
        return inversions;

    }


}
