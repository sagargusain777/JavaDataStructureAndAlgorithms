package Arrays;
/*
    🔍 Linear Search Approach (O(n) Time)

    This method performs a **Linear Search** to find the index of a target element in an array.
    - It checks each element from left to right.
    - If the target is found, it returns the index.
    - If the target is not found or the array is empty, it returns -1.

    Linear Search is simple and works on both sorted and unsorted arrays,
    but it's less efficient than binary search for large sorted datasets.
*/
public class LinearSearch {
    public static void main(String [] args){
        int [] arr = {72,35,71,2,4,3,67,64,2};
        int [] arr2 = {};
        int [] arr3 = {72,35,71,2,4,3,67,2};
        int key = 64;
        System.out.println(linearSearching(arr,key));
        System.out.println(linearSearching(arr2,key));
        System.out.println(linearSearching(arr3,key));


    }
    public static int linearSearching(int [] nums, int target){
        if(nums.length == 0){
            return -1;
        }
        // Traverse the array and compare each element with the target
        for( int i = 0 ; i < nums.length ; i++){

            if( nums[i] == target ){

                return i;
            }
        }
        // Return -1 if target not found
        return -1;

    }
}
