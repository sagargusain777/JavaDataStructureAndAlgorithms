package PracticeBinarySearch;

public class BinarySearch {
    public static void main(String [] args){
        int [] arr = {1,2,9,10,15,18,20,25,30,35};
        int target = 25;
        int answer = binarySearchCode(arr,target);
        System.out.println(answer);
    }
    public static  int binarySearchCode(int []nums, int target){

        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]< target){
                start = mid+1;
            }
            else if (nums[mid]>target){
                end = mid-1;
            }
            else{
                return  mid;
            }

        }
        return -1;
    }
}
