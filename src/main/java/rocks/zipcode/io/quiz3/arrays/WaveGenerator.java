package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str)
    {
        ArrayList<String> waves = new ArrayList<>();
        String tempLower =  str.toLowerCase();
        StringBuilder sb;
        boolean skip = false;

        for(int j = 0; j < str.length(); j++){
            sb = new StringBuilder();
            for(int i = 0; i <str.length(); i++){
                if(i==j){
                    if(Character.isAlphabetic(tempLower.charAt(i))){
                        sb.append(Character.toUpperCase(tempLower.charAt(i)));
                    }
                    else {
                        skip = true;
                    }
                }
                else {
                    sb.append(tempLower.charAt(i));
                }
            }
            if(skip){
                skip = false;
            }
            else {
                waves.add(sb.toString());
            }
        }

        String[] retVal = waves.toArray(new String[waves.size()]);

        return retVal;
    }
}
