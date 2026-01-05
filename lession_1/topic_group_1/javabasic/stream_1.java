package lession_1.topic_group_1.javabasic;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class stream_1 {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1, x -> x + 1).limit(20000).toList();

        List<Long> list1 = list.stream()
                .map(stream_1::factorial)
                .toList();
        long endTime = System.currentTimeMillis();
        System.out.println(list1);
        System.out.println("Old Time taken = " + (endTime - startTime) + " ms");

        long startTime1 = System.currentTimeMillis();
        List<Long> list2 = list.parallelStream()
                .map(stream_1::factorial)
                .toList();
        long endTime1 = System.currentTimeMillis();

        System.out.println("Old Time taken = " + (endTime1 - startTime1) + " ms");

    }

    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {

            result *= n;
        }
        return result;
    }
}
