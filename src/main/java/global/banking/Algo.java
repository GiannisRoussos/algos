package global.banking;

import java.util.List;

/**
 * 1. [7,2,5,1,6,4]
 * 2.  7 min 7 - 7 =0
 * 3.  2 min 2 - 2 =0
 * 3.  2 min 5-2 =3
 * 4.  1 min 5 -1 = 4
 * 5   1 min 6-1 =5
 */
public class Algo {

    public static void main(String[] args) {
        int[] array = {7, 2, 5, 1, 6, 4};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            min = Math.min(min, array[i]);
            max = Math.max(max, array[i] - min);
        }
        System.out.println(max);
    }
}
