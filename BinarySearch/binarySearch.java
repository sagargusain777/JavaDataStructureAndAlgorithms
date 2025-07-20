package BinarySearch;

public class binarySearch {
    public static void main(String [] args){
       int [] nums = { 2, 3, 4, 10, 40 };
       int target = 10;
       int answer = binarySearchElement(nums,target);
       System.out.println(answer);
      }

    public static int binarySearchElement(int [] arr, int target){
        int start = 0;
        int end  =  arr.length;
        while (start<=end){
            // if we do start + end /2 it might be possible that we go out of range in integer value
             int mid = start + (end - start)/2;

             if(target < arr[mid]){

                 end =  mid - 1;
             } else if ( target > arr[mid]){
                 start = mid +1;
             } else{
                 return mid;
             }

        }
        return -1;
    }
}
