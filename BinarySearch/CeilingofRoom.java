package BinarySearch;
//Question   :  Find the smallest number that is greater than  or equal to the target  (target<=arr[element])
public class CeilingofRoom {
    public static void main(String [] args){
        int [] nums = {1,2,3,3,5,6,9,14,16,16,16,18,19};
        int target = 15;
        int answer = ceilingRoom(nums, target);
        System.out.println(answer);

    }

    public static int  ceilingRoom(int [] arr, int target){
        int start = 0;
        int end  =  arr.length-1;
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
        return start;


    }
}
