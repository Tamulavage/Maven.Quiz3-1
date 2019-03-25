package rocks.zipcode.io.quiz3.fundamentals;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i == indexToCapitalize) {
                sb.append(str.toUpperCase().charAt(i));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        Boolean retVal = false;
        Character baseValue = baseString.charAt(indexOfString);
        if (baseValue.equals(characterToCheckFor)) {
            retVal = true;
        }
        return retVal;
    }

    public static String[] getAllSubStrings(String string) {

        ArrayList<String> ListOfSubStrings = new ArrayList<>();
        Integer lenOfString = string.length();

        for (int i = 0; i < lenOfString; i++) {
            for (int j = (i + 1); j <= (lenOfString); j++) {
                ListOfSubStrings.add(string.substring(i, j));
            }
        }

        Collections.sort(ListOfSubStrings);

        String[] retVal = ListOfSubStrings.toArray(new String[ListOfSubStrings.size()]);

        retVal = removeDups(retVal);

        return retVal;
    }

    public static Integer getNumberOfSubStrings(String input) {
        String[] temp = getAllSubStrings(input);
        return temp.length;
    }

    private static String[] removeDups(String[] input) {

        ArrayList<String> retVal = new ArrayList<>();
        if (!hasDuplicatedElements(input)) {
            return input;
        } else {

            for (int i = 0, j = 0; i < (input.length - 1); i++) {
                if (!input[i].equals(input[i + 1])) {
                    retVal.add(input[i]);
                }
            }

            retVal.add(input[input.length - 1]);
        }
        String[] converter = retVal.toArray(new String[retVal.size()]);

        return converter;

    }


    private static Boolean hasDuplicatedElements(String[] strings) {
        Boolean retVal = false;
        for (String ele : strings) {
            Integer countDups = countElements(strings, ele);
            if (countDups > 1) {
                retVal = true;
            }
        }
        return retVal;

    }

    private static Integer countElements(String[] strings, String string) {
        Integer retVal = 0;
        for (String ele : strings) {
            if (ele.equals(string)) {
                retVal++;
            }
        }
        return retVal;
    }
}
