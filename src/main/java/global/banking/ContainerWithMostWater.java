package global.banking;


/**
 * left = 0 , right = n-1
 * maxArea = ?
 * currentArea= area
 */
public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        //int[] height = {1, 1};
        System.out.println(findMaxArea(height));
    }

    public static int findMaxArea(int[] height) {
        //Initialization
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            //Calculate currentArea with the smaller peak
            int currentArea = (right - left) * Math.min(height[left], height[right]);
            //Keep max area
            maxArea = Math.max(maxArea, currentArea);
            //change index
            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }
        return maxArea;
    }
}

