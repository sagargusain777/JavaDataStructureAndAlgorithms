package Arrays;
import java.util.Arrays;
public class TwoSumBetterSortedArray {
    public static void main(String [] args){

        int [] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString( twoSum(nums,target)));

    }
    static int [] twoSum(int [] arr,int target){
        int [] finalArray = new int [2];
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            if(arr[start]+arr[end]== target){
                finalArray[0]= arr[start];
                finalArray[1]= arr[end];
                break;


            }
            else if (arr[start]+arr[end]<target){
                start++;
            }
            else{
                end--;
            }
        }
        return  finalArray;
    }
}
