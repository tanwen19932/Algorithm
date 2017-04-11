package sort;

/**
 * @author TW
 * @date TW on 2017/3/28.
 */
public class SelectionSort {
    public static void sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int min = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[min] > nums[j]) {
                    min = j;
                }
            }
            Utils.swap(nums, i, min);
        }
    }
}
