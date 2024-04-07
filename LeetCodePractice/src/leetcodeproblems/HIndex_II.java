package leetcodeproblems;
//leetcode 275
public class HIndex_II {
    class Solution {
        public int hIndex(int[] citations) {
            boolean flag = true;
            for(int i = 0; i < citations.length; i++) {
                if(citations[i]>0) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                return 0;
            }

            int val = 0;
            for(int i = citations.length-1; i >= 0; i--) {
                int citationIndex = i+1;
                int index = findIndex(citations, citationIndex);
                int count = citations.length - index;
                if(citationIndex <= count) {
                    val = Math.max(val,citationIndex);
                }
                System.out.println(citationIndex + " ---> " + count);
            }
            return val;
        }
        public int findIndex(int []citations, int hIndex) {
            int left = 0;
            int right = citations.length-1;

            while(left < right) {
                int mid = left + (right-left)/2;
                if(citations[mid]< hIndex) {
                    left = mid+1;
                } else {
                    right = mid;
                }
            }
            return right;
        }
    }
}
