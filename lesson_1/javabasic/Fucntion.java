package lesson_1.javabasic;


import java.util.function.Function;

public class Fucntion {
    public static void main(String[] args) {
        Function<Integer, Integer> doubleValue = x -> 2 * x;

        System.out.println(doubleValue.apply(12));
    }
}
