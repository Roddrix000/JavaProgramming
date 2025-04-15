package BasicProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_Maximum_Consecutive {

    public static void main(String[] args) {


        List<Integer> num = Arrays.asList(1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

        //find

        List<Integer> uniqNum = new ArrayList<>();
        for (Integer e : num) {
            if (!uniqNum.contains(e.intValue())) {
                uniqNum.add(e.intValue());
            }
        }
        int countOf0 = 0;
        int countOf1 = 0;
        int max = 0;
        for (int i = 0; i < uniqNum.size(); i++) {
            Integer tempNum = uniqNum.get(i);
            for (int j = 0; j < num.size(); j++) {
                if (tempNum.equals((Integer) num.get(i))) {
                    countOf1++;
                } else {
                    countOf0++;
                }
            }
            System.out.println(countOf1 +""+ countOf0);
            if (countOf1 > countOf0) {
                System.out.println(uniqNum.get(0));
                break;
            } else {
                System.out.println(uniqNum.get(1));
                break;
            }
        }

    }
}
