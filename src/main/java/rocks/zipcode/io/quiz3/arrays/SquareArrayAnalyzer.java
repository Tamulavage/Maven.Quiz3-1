package rocks.zipcode.io.quiz3.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    /**
     * Given two shuffled arrays `inputArray`, and `squareValues`,
     * ensure each `element` of `inputArray` has a corresponding `value` in `squaredValues`
     * such that `element == value*value`
     *
     * @param inputArray    an array of integers
     * @param squaredValues an array of integers
     * @return true if each `inputArray[i]` has a corresponding `squaredValues[j]` such that `squaredValues[j] == inputArray[i] * inputArray[i]`
     */
    public static Boolean compare(Integer[] inputArray, Integer[] squaredValues) {

        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = inputArray[i] * inputArray[i];
        }


        return Arrays.equals(sortArray(inputArray), sortArray(squaredValues));
    }

    private static  Integer[] sortArray(Integer[] arrayToSort){
        List<Integer> sortedList = Arrays.asList(arrayToSort);
        Collections.sort(sortedList);

        return sortedList.toArray(new Integer[sortedList.size()]);

    }
}
