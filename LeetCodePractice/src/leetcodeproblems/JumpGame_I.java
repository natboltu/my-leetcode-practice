package leetcodeproblems;

public class JumpGame_I {
    public enum JumpType {
        UNKNOWN, BAD, GOOD
    }
    JumpType[] hash;
    public class Solution{
        boolean canJump(int[] nums) {
            hash = new JumpType[nums.length];
            for(int i = 0; i < nums.length; ++i) {
                hash[i] = JumpType.UNKNOWN;
            }
            hash[nums.length-1] = JumpType.GOOD;
            return checkJump(0, nums);
        }

        private boolean checkJump(int positon, int[] nums) {
            if(hash[positon] != JumpType.UNKNOWN) {
                if(hash[positon] == JumpType.GOOD) {
                    return true;
                }
                return false;
            }
            int furthestJump = Math.min(positon+ nums[positon] , nums.length-1);
            for(int next = positon+1; next <= furthestJump; next++) {
                if(checkJump(next,nums)) {
                    hash[next] = JumpType.GOOD;
                    return true;
                }
            }
            hash[positon] = JumpType.BAD;
            return false;
        }
    }
}
