package Lambda;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Streams {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(new Integer[]{1, 3, 4, 5, 1, 2, 1, 5, 3, 18, 2, 90, 4, 109, 6, 5}));
        System.out.println(list);
        List<Integer> collect = list.stream()
                .filter(integer -> integer > 2)
                .sorted(Comparator.reverseOrder())
                .collect(toList());
        System.out.println(collect);

        System.out.println("grouping by");
        Map<Integer, Long> count = list.stream()
                .sorted()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(count);

        //Example: how to count summary of all numbers from string:
        String str = "157248";
        int number = Integer.parseInt(str);
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println(sum); //sum=27
        // Integer sum = Collectors.toList(Arrays.(str.toCharArray()));

    }

}
