package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        Boolean retval = false;
        for(Character c: word.toCharArray()){
            if(isVowel(c)){
                retval = true;
            }
        }
        return retval;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        Integer retVal = -1;

        for(int i = 0; i< word.length(); i++){
            if(isVowel(word.charAt(i))){
                return i; // use return instead of reassign incase there is more
            }
        }

        return retVal;
    }


    public static Boolean startsWithVowel(String word) {
        return isVowel(word.charAt(0));
    }

    public static Boolean isVowel(Character character) {
        Boolean retVal = false;
        String vowels = "AEIOUaeiou";
        for(Character c:vowels.toCharArray()){
            if(c.equals(character)){
                retVal = true;
            }
        }
        return retVal;
    }
}
