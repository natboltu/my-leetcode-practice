package leetcodeproblems;


import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class Product_Of_Array_Except_SelfTest {

    @Test
    public void productExceptSelf() {
        Product_Of_Array_Except_Self prodSelft = new Product_Of_Array_Except_Self();
        int[] output = prodSelft.productExceptSelf(new int[]{1, 2, 3, 4});
        int[] expected = new int[]{24,12,8,6};
        Assert.assertEquals(expected, output);
    }

    @Test
    public void productExceptSelft() {
        Product_Of_Array_Except_Self prodSelft = new Product_Of_Array_Except_Self();
        int[] output = prodSelft.productExceptSelf(new int[]{-1,1,0,-3,3});
        int[] expected = new int[]{0,0,9,0,0};
        Assert.assertEquals(expected,output);
    }
}