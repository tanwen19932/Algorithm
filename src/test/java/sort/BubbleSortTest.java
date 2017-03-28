package sort;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author TW
 * @date TW on 2017/3/28.
 */
public class BubbleSortTest {
    @Test
    public void sort() throws Exception {
        List integers =  Lists.newArrayList(9,2,3,4,5,10,1,2,4,4,5,6,7,1,3,2,4,55,4,2,331,322);
        int[] nums = new int[integers.size()];
        for (int i = 0; i < integers.size(); i++) {
            nums[i]= Integer.valueOf(integers.get(i).toString());
        }
        BubbleSort.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

}