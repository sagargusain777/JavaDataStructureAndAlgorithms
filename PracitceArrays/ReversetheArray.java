package PracitceArrays;
import java.util.Arrays;
public class ReversetheArray {
    public static void main(String [] args){
        int [] arr ={1,2,3,4,5};
        int [] evenArray = {1,2,3,4,5,6,7,8,9,10,11,12};
        reverse(arr);
        reverse(evenArray);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(evenArray));

    }
    public static void reverse(int [] arr){
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
