package PracticeWeek.July14;
import java.util.Arrays;
public class ReverseTheArray {
    public static void main(String [] args){

        int [] evenArray = {1,2,3,4,5,6};
        int [] oddArray ={1,2,3,4,5};
        reverse(evenArray);
        reverse(oddArray);
        System.out.println(Arrays.toString(evenArray));
        System.out.println(Arrays.toString(oddArray));
    }

    static void  reverse( int [] arr){
        int start = 0;
        int end =  arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
