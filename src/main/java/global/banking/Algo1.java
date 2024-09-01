package global.banking;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Algo1 {


    public static void main(String[] args) {
        int[] nums = {11, 2, 15, 7};
        int target = 9;
        //Call mehtod findPositions
        int[] positions = findPositions(nums, target);
        System.out.println(Arrays.toString(positions));
    }

    /**
     * To have O(n) complexity we will use HashMap
     */
    public static int[] findPositions(int[] nums, int target) {
        int position1 = -1;
        int position2 = -1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int completion = target - nums[i];
            Integer completionIndex = map.get(completion);
            if (completionIndex != null) {
                position1 =completionIndex;
                position2 = i;
                break;
            }
            map.put(nums[i], i);
        }
       return new int[]{position1, position2};
    }
}



