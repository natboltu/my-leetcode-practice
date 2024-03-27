package leetcodeproblems;

public class ReverseWord_II {
    class Solution {
        public void reverse(char[] s, int left,int right) {
            while(left < right) {
                char temp = s[left];
                s[left]= s[right];
                s[right]=temp;
                left++;
                right--;
            }
        }

        public void reverseEachWord(char[]s){
            int len = s.length;
            int start = 0, end = 0;
            while(start < len) {
                while(end < len && s[end] != ' ') {
                    end++;
                }
                reverse(s, start, end-1);
                start = end+1;
                ++end;
            }
        }

        public void reverseWords(char[] s) {
            reverse(s, 0, s.length-1);
            reverseEachWord(s);
        }
    }
}
