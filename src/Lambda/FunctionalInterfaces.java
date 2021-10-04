package Lambda;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = integer -> integer > 0;
        System.out.println(isPositive.test(5));

        Function<Integer, String> convertIntegerToString = integer -> "String of integer is : " + Integer.toString(integer);
        System.out.println(convertIntegerToString.apply(13));

        
    }
}
