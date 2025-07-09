package Practise;
import java.util.Arrays;
public class ReverseArray {

    public static void main (String [] args){


        int [ ] even = {1,2,3,4,5,6};
        int []  odd = {1,2,3,4,5};
        reverse(even);
        reverse(odd);
        System.out.println(Arrays.toString(even));
        System.out.println(Arrays.toString(odd));
    }

    static void reverse(int [] arr){
        int start = 0;
        int end = arr.length -1;

        while (start < end ){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] =  temp;
            start++;
            end--;
        }

    }
}
