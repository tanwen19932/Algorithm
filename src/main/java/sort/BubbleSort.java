package sort;

import com.google.common.collect.Lists;

/**
 * @author TW
 * @date TW on 2017/3/27.
 */
public class BubbleSort {
    public static void sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            for (int j = i; j < nums.length; j++) {
                if(nums[i]>nums[j]){
                    Utils.swap(nums,i,j);
                }
            }
        }
    }
}
