package leetcodeproblems;

public class RemoveDuplicatesFromSortedArray_II {
    class Solution {
        public int removeDuplicates(int[] nums) {
            int j = 1, count = 1;
            for(int i = 1; i < nums.length; i++) {
                if(nums[i] == nums[i-1]) {
                    count++;
                } else {
                    count=1;
                }

                if(count <= 2) {
                    nums[j++] = nums[i];
                }
            }

            for(int i = 0; i < nums.length; i++) {
                System.out.printf("%d  ", nums[i]);
            }
            return j;
        }
    }
}
