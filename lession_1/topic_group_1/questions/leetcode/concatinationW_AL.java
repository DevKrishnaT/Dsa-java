package lession_1.topic_group_1.questions.leetcode;
import java.util.ArrayList;

public class concatinationW_AL {

    public static void main(String[] args) {
    ArrayList <Integer> A1 = new ArrayList<>();
    int[] nums = {1 ,32, 4, 5, 6,67};

    for(int i : nums){
        A1.add(i);
    }
        for(int i : nums){
            A1.add(i);
        }

        for(int i : A1){
            System.out.print(i);
        }
    }
 }
