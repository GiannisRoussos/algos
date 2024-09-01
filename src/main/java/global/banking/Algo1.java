package global.banking;

import java.util.HashMap;
import java.util.Map;

public class Algo1 {
    /**
     * To have O(n) complexity we will use HashMap
     */

    public static void main(String[] args) {
        int[] nums = {11, 2, 15, 7};
        int target = 9;
        int flag1 = -1;
        int flag2 = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complet = target - nums[i];
            if (map.containsKey(complet)) {
                flag1 = map.get(complet);
                flag2 = i;
                break;  // Βρέθηκε το ζευγάρι, σταματάμε τον βρόχο
            }
           map.put(nums[i], i);
        }
        System.out.println(flag1);
        System.out.println(flag2);
    }
}
