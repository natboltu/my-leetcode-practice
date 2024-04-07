package leetcodeproblems;
//#leetcod 45
public class JumpGame_II {
    class Solution {

        public int jump(int[] nums) {
            int left = 0, right = 0;
            int steps = 0;
            while(right < nums.length-1) {
                int furthest = 0;
                for(int position = left; position < right+1; position++)  {
                    furthest = Math.max(furthest, position+nums[position]);
                }
                left = right+1;
                right = furthest;
                steps++;
            }
            return steps;
        }
    }
}
