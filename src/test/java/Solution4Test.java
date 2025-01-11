import org.example.solution.Problem4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution4Test {
    @Test
    public void test1() {
        var problem = new Problem4();

        int[] nums1 = new int[]{1, 2};
        int[] nums2 = new int[]{2};

        var ans = problem.findMedianSortedArrays(nums1, nums2);
        Assertions.assertEquals(2.00000, ans);
    }
}
