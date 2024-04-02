package leetcodeproblems;
//#1198 leetcode
public class FindCommonSmallestElement {
    class Solution {
        public int smallestCommonElement(int[][] mat) {
            int[] hash = new int[10001];
            for(int i = 0; i < mat.length; i++) {
                for(int j = 0; j < mat[i].length; j++) {
                    hash[mat[i][j]]++;
                }
            }
            int len = mat.length;
            int minimum = Integer.MAX_VALUE;

            for(int i = 0; i < 10001; i++) {
                if(hash[i] == len) {
                    minimum = Math.min(i, minimum);
                }
            }
            return minimum == Integer.MAX_VALUE ? -1: minimum;
        }
    }
}
