/* 
// if array is sorted，the better algorith could be

import java.util.Arrays;

public class MainClass {

    public static int[] twoSum(int[] nums, int target){
        int l = 0;
        int r = nums.length - 1;

        while(l < r){

            while(nums[l] + nums[r] > target){
                r--;
            }
            if(nums[l] + nums[r] == target){
                return new int[]{l, r};
            }else{
                l++;
            }
        }

        return new int[]{-1};
    }
    
    public static void main(String[] args) {
        
        int[] nums = twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(nums));
    }
}
 */

 import java.util.Arrays;

public class MainClass {

    public static int[] twoSum(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1};
    }
    
    public static void main(String[] args) {
        
        int[] nums = twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(nums));
    }
}