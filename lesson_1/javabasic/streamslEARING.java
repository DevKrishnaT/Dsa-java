package lesson_1.javabasic;

import java.util.Arrays;
import java.util.List;

public class streamslEARING {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        long count = l1.stream().filter(x -> x % 2 == 0).count();
        long count1 = l1.stream().map(x -> x.byteValue()).count();
        System.out.println(count);
        System.out.println(count1);
        List<String> list = Arrays.asList("ram", "Shyam", "ghanshyam");
        list.stream().map(String::toUpperCase).forEach(System.out::println);
        System.out.println(l1.stream().reduce(Integer::sum).stream().toList());

    }
}
