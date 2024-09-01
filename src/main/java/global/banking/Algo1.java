package global.banking;

import java.util.HashMap;
import java.util.Map;

public class Algo1 {


    public static void main(String[] args) {
        int[] nums = {11, 2, 15, 7};
        int target = 9;
        int position1 = -1;
        int position2 = -1;

        /**
         * First Try
         */
        boolean found = false;
        for (int i = 0; i < nums.length - 1 && !found; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.addExact(nums[i], nums[j]) == target) {
                    position1 = i;
                    position2 = j;
                    found = true;
                    break;
                }
            }
        }
        System.out.println(position1);
        System.out.println(position2);

        /**
         * To have O(n) complexity we will use HashMap
         */
        int position3 = -1;
        int position4 = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int completion = target - nums[i];
            if (map.containsKey(completion)) {
                position3 = map.get(completion);
                position4 = i;
                break;  // Βρέθηκε το ζευγάρι, σταματάμε τον βρόχο
            }
            map.put(nums[i], i);
        }
        System.out.println(position3);
        System.out.println(position4);

    }
}



