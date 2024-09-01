package global.banking;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * First Try
 */
public class Algo {

    public static void main(String[] args) {
        int[] nums = {11, 2, 15, 7};
        //int[] nums = {7, 2};
        int target = 9;
        int flag1 = 0;
        int flag2 = 0;
        boolean found = false;
        for (int i = 0; i < nums.length - 1 && !found; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.addExact(nums[i], nums[j]) == target) {
                    flag1 = i;
                    flag2 = j;
                    found = true;
                    break;
                }
            }
        }
        System.out.println(flag1);
        System.out.println(flag2);
    }
}