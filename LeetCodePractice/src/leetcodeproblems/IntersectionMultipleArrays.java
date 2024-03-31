package leetcodeproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class IntersectionMultipleArrays {
    // 2248
    class Solution {
        public List<Integer> intersection(int[][] nums) {
            int len = nums.length;

            var ans = new ArrayList<Integer>();
            for(int i = 0; i < nums[0].length; i++) {
                int val  = nums[0][i];
                boolean found = true;
                for(int j = 1; j < nums.length; j++) {
                    List<Integer> list = Arrays.stream(nums[j])
                            .mapToObj(item -> item)
                            .toList();
                    if(!list.contains(val)) {
                        found = false;
                        break;
                    }
                }
                if(found == true) {
                    ans.add(val);
                }
            }
            return ans.stream().sorted(Comparator.comparing(i -> i)).toList();
        }
    }
}
