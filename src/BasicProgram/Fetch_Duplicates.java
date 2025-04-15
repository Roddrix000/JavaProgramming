package BasicProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Fetch_Duplicates {

    public static String duplicateData="";
    public static void main(String[] args) {

        String sample="JAVA PROGRAMMING";

        char[] arr = sample.toCharArray();

        //Adding into array
         for(int i=0;i<arr.length;i++)
         {

             for(int j=i+1;j<arr.length;j++)
             {
                 char temp=arr[i];

                 if(temp==arr[j])
                 {
                     duplicateData=duplicateData.concat(String.valueOf(temp));
                     break;
                 }
             }
         }

    System.out.println(duplicateData);

    }
}
