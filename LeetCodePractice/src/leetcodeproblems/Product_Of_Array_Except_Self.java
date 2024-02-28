package leetcodeproblems;

//#238 Product of array except self
public class Product_Of_Array_Except_Self {
    public int[] productExceptSelf(int[] nums) {
        int ar[] = new int[nums.length];
        int prefixProduct[] =  new int[nums.length];
        int suffixProduct[] = new int[nums.length];

        int seed = 1;
        for(int i = 0; i < nums.length; i++) {
            prefixProduct[i] = i==0 ? seed: prefixProduct[i-1]*nums[i-1];
        }
        for(int i = nums.length-1; i >=0; i--) {
            suffixProduct[i] = i == nums.length-1? seed: suffixProduct[i+1]*nums[i+1];
        }

        for(int i = 0; i < nums.length; ++i) {
            ar[i] = prefixProduct[i]*suffixProduct[i];
        }
        return ar;
    }
}
