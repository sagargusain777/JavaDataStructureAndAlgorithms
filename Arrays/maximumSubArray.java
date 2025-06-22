// Brute-force approach to find the maximum subarray sum (Time: O(n^2))
// --------------------------------------------------------------
// This method checks all possible subarrays of the given array:
// 1. Outer loop picks the starting index 'i' of a subarray.
// 2. Inner loop extends the subarray from index 'i' to 'j' and keeps adding elements to 'currentSum'.
// 3. For every subarray (from i to j), we update the maximumSubsequentSum if currentSum is greater.
// 4. currentSum is reset to 0 when a new starting index is picked.
// This way, we explore all subarrays and find the one with the highest sum.
// --------------------------------------------------------------

package Arrays;
import java.util.Arrays;

public class maximumSubArray {
    public static void main (String [] args){

        int [] subarray = { -2,1,-3,4,-1,2,1,-5,4};
        int [] subarray1 = { 5,4,-1,7,8};

        System.out.println(maximumSum(subarray));
        System.out.println(maximumSum(subarray1));


    }

    public  static int  maximumSum( int [] nums){
         int maximumSubsequentSum = Integer.MIN_VALUE;
        for(int i = 0;i < nums.length; i++){

            int currentSum = 0;

            for( int j = i; j < nums.length ; j++  ){

                currentSum += nums[j];
                maximumSubsequentSum = Math.max(maximumSubsequentSum,currentSum);
            }

        }
        return maximumSubsequentSum;

    }
}
