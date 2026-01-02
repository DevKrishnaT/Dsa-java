package lession_1.topic_group_1.questions.basic_q;

public class finXinArr {
    public static int find(int[] arr, int x){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x){
                count++;
            }

        }
        return count;
    };
    public static void main(String[] args) {
    int[] arr  = {-1, -1, -1, 2, 2, -1};
    int x = -1;
        System.out.println(find(arr , x));


    }
}
