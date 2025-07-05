package Arrays;
import java.util.Arrays;
public class ReverseArrayWhile {
    public static void main(String [] args){
        int [] nums = {1,2,3,4,5,6};
        int [] nums2 = {1,2,3,4,5};
        reverseArray(nums);
        reverseArray(nums2);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(nums2));
    }


    static void reverseArray(int [] arr){

        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]= temp;

            start++;
            end--;
        }
    }
}

