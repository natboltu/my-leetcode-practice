package leetcodeproblems;
// leetcode 2932
public class MaximumXORTwoNumbers_I {
    class Solution {
        public int maximumStrongPairXor(int[] nums) {
            int maximum = Integer.MIN_VALUE;
            for(int i = 0; i < nums.length; i++) {
                for(int j = 0; j < nums.length; j++) {
                    int x = nums[i];
                    int y = nums[j];
                    if(Math.abs(x-y) <= Math.min(x,y)) {
                        maximum = Math.max(maximum, x^y);
                    }
                }
            }
            return maximum;
        }
    }
}
