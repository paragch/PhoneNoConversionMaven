package TestGroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by paragchatterjee on 29/04/2017.
 */

public class Transform {



    public String transform(String S)
    {
        String numberString = pickNumbers(S);
        String arrangedNumber = arrangeNumbers(numberString);
        return arrangedNumber;
    }

    public String pickNumbers(String S){

        String numberOnly= S.replaceAll("[^0-9]", "");
        return numberOnly;

    }

    private void iterateString(StringBuilder sbr, int sbLength)
    {
        for(int i=0;i < sbLength; i=i+3) {
            if( (i >0) && (i!=(sbLength-1))) {
                sbr.insert(i, '-');
                i=i+1;
            }
        }
    }

    public String arrangeNumbers(String S){
        List<String> myList = new ArrayList<String>(Arrays.asList(S.split("")));

        int stringLength = S.length();
        StringBuilder sbr = new StringBuilder(S);
        int sbLength= stringLength + stringLength/3;


        if(stringLength%3==1)
        {
            int iterateSize = sbLength-4;
            iterateString(sbr,iterateSize);
            sbr.insert(sbLength-3, '-');
        }
        else
        {
            iterateString(sbr,sbLength);

        }



        return sbr.toString();
    }




}
