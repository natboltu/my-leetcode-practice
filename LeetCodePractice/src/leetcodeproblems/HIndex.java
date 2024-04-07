package leetcodeproblems;

import java.util.Arrays;

//#leetcode 274
public class HIndex {
    class Solution {
        public int hIndex(int[] citations) {
            int citationHash[] = new int[5001];
            Arrays.fill(citationHash, 0);

            for(int i = citations.length-1; i >= 0; i--) {
                int citationIndex = i+1;
                for(int j = 0; j < citations.length; j++) {
                    if(citations[j] >= citationIndex) {
                        citationHash[citationIndex]++;
                    }
                }
            }
            int value = 0;
            int val = citations.length;
            while(val >= 1) {
                int count = citationHash[val];
                System.out.println("val: " + val  + " count: "  + count);
                if(count >= val) {
                    value = val;
                    break;
                }
                val--;
            }
            return value;
        }
    }
}
