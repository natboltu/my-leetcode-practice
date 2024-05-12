package leetcodeproblems;
//#leetcode 2373
public class LargetLocalValuesInAMatrix {
    public int[][] largestLocal(int[][]grid) {
        int N = grid.length;
        int[][] mat = new int[N-2][N-2];

        for(int i = 0; i < N-2; i++)
            for(int j = 0; j < N-2; j++)
                mat[i][j] = findMax(grid, i, j);
        return mat;
    }

    private int findMax(int[][] grid, int i, int j) {
        int maxValue =  Integer.MIN_VALUE;
        for(int m = i; m < i+3; m++)
            for(int n = j; n < j+3; n++)
                maxValue  = Math.max(grid[m][n], maxValue);
        return  maxValue;
    }

    public static void main(String[] args) {
        int [][] testArray = new int[][] {
                {9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}
        };
        LargetLocalValuesInAMatrix largetLocalValuesInAMatrix = new LargetLocalValuesInAMatrix();
        largetLocalValuesInAMatrix.largestLocal(testArray);
    }
}
