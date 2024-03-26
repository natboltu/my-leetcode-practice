package leetcodeproblems;

public class Maximum_Subarray_sum {

    public static int calculate(int[] ar,int left, int right) {
        if(right == 1) {
            return ar[0];
        }
        int m = right/2;
        int left_mss = calculate(ar,0, m);
        int right_mss = calculate(ar,m+1, right-m);
        int left_max = Integer.MIN_VALUE, right_max = Integer.MIN_VALUE, sum = 0;
        for(int i = m; i < right; i++) {
            sum+=ar[i];
            right_max = Math.max(sum, right_max);
        }
        sum = 0;
        for(int i = m-1; i >= 0; i--) {
            sum+= ar[i];
            left_max = Math.max(sum, left_max);
        }
        int ans = Math.max(left_mss, right_mss);
        return Math.max(ans, left_max+right_max);
    }
}
