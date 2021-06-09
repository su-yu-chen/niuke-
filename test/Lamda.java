package com.example.test.ceti;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author yd
 * @date 2021/4/1 13:54
 */
public class Lamda {

    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        List<Transaction> a=transactions.stream()
                .filter(x -> x.getYear()==2011)
                .sorted(
//        Comparator.comparing(Transaction::getValue) //排序1
                        //排序2
                        (o1, o2) ->
                                o2.getValue()-o1.getValue()
                ).collect(Collectors.toList());


        List<String> cities=transactions.stream().map(x -> x.getTrader().getCity()).distinct().collect(Collectors.toList());
        String city=transactions.stream().map(x -> x.getTrader().getCity()).distinct().collect(Collectors.joining(","));


        List<Trader> names=transactions.stream().map(Transaction::getTrader).filter(x ->x.getCity().equals("Cambridge"))
                .distinct().sorted(Comparator.comparing(Trader::getName)).collect(Collectors.toList());

        String b=transactions.stream().map(x -> x.getTrader().getName())
                .distinct().sorted().reduce("",(a1,a2) -> a1+a2);

        boolean traders=transactions.stream().anyMatch(transaction ->transaction.getTrader().getCity().equals("Milan"));

        Integer money=transactions.stream().filter(x->x.getTrader().getCity().equals("Cambridge")).map(transaction -> transaction.getValue())
                .reduce((count,sum) -> count+sum).get();
//                collect(Collectors.joining(","));

        IntSummaryStatistics maxMoney=transactions.stream().map(transaction ->transaction.getValue()).mapToInt(x ->x).summaryStatistics();
        int max=transactions.stream().map(x ->x.getValue()).reduce(0,Integer::max);

//        System.out.println(max);

//        transactions.stream()
//                .map(Transaction::getTrader)
//                .filter(trader -> trader.getCity().equals("Milan"))
//                .forEach(trader -> trader.setCity("Cambridge"));
//        System.out.println(transactions);

//        Optional[Transaction(trader=Trader(name=Brian, city=Cambridge), year=2011, value=300)]
//        Transaction s=transactions.stream().filter(transaction ->)
        Optional<Transaction> min=transactions.stream().min((o1,o2)->o1.getValue()<o2.getValue()?1:0);
        System.out.println(min);
    }
}
