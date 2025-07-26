package BinarySearch;
//Given a sorted array arr[] and a number target, the task is to find the lower bound of the target in this given array
//The lower bound of a number is defined as the smallest index in the sorted array where the element is greater than or equal to the given number.
//smallest index arr[element] > = target
/*Input: arr[] = {2, 3, 7, 10, 11, 11, 25}, target = 9
        Output: 3
        Explanation: 3 is the smallest index in arr[] where element (arr[3] = 10) is greater than or equal to 9.

        Input: arr[] = {2, 3, 7, 10, 11, 11, 25}, target = 11
        Output: 4
        Explanation: 4 is the smallest index in arr[] where element (arr[4] = 11) is greater than or equal to 11.

        Input: arr[] = {2, 3, 7, 10, 11, 11, 25}, target = 100
        Output: 6
        Explanation: As no element in arr[] is greater than 100, return the length of array.*/
public class LowerBound {
    public static void main (String [] args){
        int [] arr1 = {2, 3, 7, 10, 11, 11, 25};
        int target1 = 11;
        int []arr2 = {2, 3, 7, 10, 11, 11, 25};
        int target2 = 100;

        System.out.println(lowerBoundElement(arr1,target1));
        System.out.println(lowerBoundElement(arr2,target2));


    }
    public static int lowerBoundElement(int [] arr, int target){
        int answer = arr.length;
        int start = 0;
        int end = arr.length-1;


        //Case when the target is greater than the last element we have return the array length
       // if(arr[end]< target) return arr.length; Just take the answer as array length this will also check this if statement

        while (start<=end){

            int mid = start + (end - start)/2;
            if(arr[mid]>=target){
                answer = mid;
                end = mid-1;
            }
            else {
                start = mid+1 ;
            }

        }


        return answer;
    }
}
