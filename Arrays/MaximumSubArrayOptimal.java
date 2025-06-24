package Arrays;

/*
    🔍 Optimal Approach: Kadane’s Algorithm (O(n) Time)

    This method finds the maximum sum of any contiguous subarray using Kadane’s Algorithm.
    - We iterate through the array while maintaining a running sum (`currentSum`).
    - If `currentSum` becomes negative, we reset it to 0 since it won’t help us form a maximum sum.
    - At each step, we update `maximumSum` if `currentSum` exceeds it.

    Kadane’s Algorithm ensures we find the optimal subarray sum in linear time with constant space.
*/

public class MaximumSubArrayOptimal {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] arr2 = {5, 4, -1, 7, 8};

        System.out.println(maximumSubArray(arr));   // Output: 6
        System.out.println(maximumSubArray(arr2));  // Output: 23
    }

    public static int maximumSubArray(int[] nums) {
        // Stores the maximum sum found so far
        int maximumSum = Integer.MIN_VALUE;

        // Stores the current subarray sum as we iterate
        int currentSum = Integer.MIN_VALUE;

        // Loop through each element in the array
        for (int i = 0; i < nums.length; i++) {

            // If the current subarray sum is negative, reset it
            // because it would reduce the total if continued
            if (currentSum < 0) {
                currentSum = 0;
            }

            // Add the current element to the subarray sum
            currentSum += nums[i];

            // Update the maximum sum if we found a bigger one
            if (maximumSum < currentSum) {
                maximumSum = currentSum;
            }
        }

        // Return the largest subarray sum found
        return maximumSum;
    }
}
