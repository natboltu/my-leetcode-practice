package leetcodeproblems;

public class ReverseWord_1 {
    class Solution {
        public String reverseWords(String s) {
            s = s.replaceAll("\\s+", " ");
            String []strs = s.split(" ");

            StringBuilder builder = new StringBuilder();
            for(int i = strs.length-1; i >= 0; i--) {
                builder.append(strs[i]);
                builder.append(" ");
            }
            return builder.toString().trim();
        }
    }
}
