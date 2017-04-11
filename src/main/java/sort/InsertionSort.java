package sort;

/**
 *
 * @author TW
 * @date TW on 2017/3/28.
 */
public class InsertionSort {
    public static void sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            //前面 i 个是排序好的 找到新增的在排序好的位置
            int position = findPositionSimple(nums,i);
            //将新的移动至该位置
            for (int j = i; j >position; j--) {
                Utils.swap(nums,j-1,j);
            }
        }
    }

    public static int findPositionSimple(int[] nums, int i ){
        int position = i;
        for (int j = 0; j < i; j++) {
            if (nums[j]>nums[i]){
                position = j;
                break;
            }
        }
        return position;
    }

    public static int findPositionDichotomy(int[] nums, int i ){
        int position = i;
        for (int j = 0; j < i; j++) {
            if (nums[j]>nums[i]){
                position = j;
            }
        }
        return position;
    }

}
