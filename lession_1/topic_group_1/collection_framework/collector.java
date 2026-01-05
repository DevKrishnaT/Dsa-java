package lession_1.topic_group_1.collection_framework;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class collector {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 34, 45, 6);
        System.out.println(list.stream().map(x -> x * 2).collect(Collectors.toList()));
        IntSummaryStatistics collect = list.stream().map(x -> x * 2).collect(Collectors.summarizingInt(x -> x));
        System.out.println(collect.getAverage());
    }
}
