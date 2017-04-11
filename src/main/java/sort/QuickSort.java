package sort;

import javax.rmi.CORBA.Util;

/**
 * @author TW
 * @date TW on 2017/4/10.
 */
public class QuickSort {
    public static void sort(int[] nums) {
        sort(0,nums.length-1,nums);
    }

    public static void sort(int begin ,int end,int[] nums){
        if(begin>=end){
            return;
        }
        int i = begin;
        int j = end;
        int temp = nums[i];
        int tempPosition = i;
        out:
        for(;;j--){
            if(nums[j]<temp){
                Utils.swap(nums,tempPosition,j);
                tempPosition= j;
                inner:
                for (;;i++){
                    if(nums[i]>temp){
                        Utils.swap(nums,tempPosition,i);
                        tempPosition=i;
                        break inner;
                    }
                    if(i==j){
                        break out;
                    }
                }
            }
            if(i==j){
                break out;
            }
        }
        sort(begin,tempPosition-1,nums);
        sort(tempPosition+1,end,nums);
    }
}
