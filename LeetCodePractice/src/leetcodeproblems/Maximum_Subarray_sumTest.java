package leetcodeproblems;


import org.junit.jupiter.api.Test;
import org.testng.Assert;

class Maximum_Subarray_sumTest {
    @Test
    public void maximumSubarraySumTest() {
        Maximum_Subarray_sum maximumSubarraySum = new Maximum_Subarray_sum();
        int mss = maximumSubarraySum.calculate(new int[]{3, -2, 5, -1}, 0, 4);
        int expected = 6;
        Assert.assertEquals(mss, expected);
    }
}