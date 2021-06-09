package com.example.test.ceti;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author yd
 * @date 2021/2/20 14:23
 */
public class Node {

    Object key;
    Object value;

    Node pre;
    Node next;

    public Node(Object key, Object value) {
        this.key = key;
        this.value = value;
    }

    public static void main(String[] args) {
//        List features = Arrays.asList("Lambdas", "Default Method",
//                "Stream", "Date and Time API");
//        Predicate<String> startWithL=n->n.startsWith("L");
//        Predicate<String> lenth=n->n.length()==6;
//
//        features.stream().filter(startWithL.or(lenth)).forEach(n-> System.out.println(n));
        Predicate<String> length=n->n.length()>2;
        List<String> costBeforeTax1 = Arrays.asList("abc", " ", "bcd", "", "defg", "jk");
        List<String> filtered = costBeforeTax1.stream().filter((x) -> x.length() > 2)
                .collect(Collectors.toList());
        System.out.println("String"+filtered);


        List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
        double a = costBeforeTax.stream().map((cost) -> cost + .12 * cost)
                .reduce((sum, cost) -> sum + cost)
                .get();
        System.out.println("Integer"+a);


        List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany",
                "Italy", "U.K.","Canada");
        String list=G7.stream().map(n -> n.toUpperCase()).collect(Collectors.joining(","));
        System.out.println(list);

        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
        List<Integer> nu=numbers.stream().map(i -> i*i).distinct().collect(Collectors.toList());
        System.out.println("NUm"+nu);

        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

        IntSummaryStatistics num=primes.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println("最大值"+num.getMax());
        System.out.println("最小值"+num.getMin());
        System.out.println("总计值"+num.getSum());
        System.out.println("平均值"+num.getAverage());
    }
}
