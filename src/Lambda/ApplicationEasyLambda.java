package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ApplicationEasyLambda {
    public static void main(String[] args) {

        Voice cow = () -> "mu-mu";
        Voice cat = () -> "mew-mew";
        System.out.println("cow said " + cow.get());
        System.out.println("cat said " + cat.get());

        Reversable<String> stringReverse = s -> {
            String result = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                result += s.charAt(i);
            }
            return result;
        };

        System.out.println("reverse example = " + stringReverse.reverse("reverse example"));

        Reversable<List<Integer>> integerArrayReverse = intArray -> {
            List<Integer> result = new ArrayList<>(intArray.size());
            for (int i = 0; i < intArray.size(); i++) {
                result.add(intArray.get(intArray.size() -1 - i));
            }
            return result;
        };

        Integer[] someIntArray = {1, 7, 33, 4562, 2};

        System.out.println(Arrays.toString(someIntArray));
        System.out.println("array reverse " + integerArrayReverse.reverse(Arrays.asList(someIntArray)).toString());


    }

    @FunctionalInterface
    interface Voice {
        String get();
    }

    @FunctionalInterface
    interface Reversable<T> {
        T reverse(T t);
    }
}
