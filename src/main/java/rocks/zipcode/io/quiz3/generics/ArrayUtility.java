package rocks.zipcode.io.quiz3.generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        SomeType retVal = null;

        for (int i = 0; i < array.length; i++) {
            if ((getNumberOfOccurrences(array[i]) % 2) == 1) {
                retVal = array[i];
            }
        }

        return retVal;
    }

    public SomeType findEvenOccurringValue() {
        SomeType retVal = null;

        for (int i = 0; i < array.length; i++) {
            if ((getNumberOfOccurrences(array[i]) % 2) == 0) {
                retVal = array[i];
            }

        }
        return retVal;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        Integer retVal = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(valueToEvaluate)) {
                retVal++;
            }
        }
        return retVal;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        List<SomeType> list = Arrays.stream(array)
                .filter(value -> predicate.apply(value))
                .collect(Collectors.toList());
        return list.toArray((SomeType[]) Array.newInstance(array[0].getClass(), list.size()));
    }
}
