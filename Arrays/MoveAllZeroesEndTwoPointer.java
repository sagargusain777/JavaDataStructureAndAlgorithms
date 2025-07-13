package Arrays;
import java.util.Arrays;
public class MoveAllZeroesEndTwoPointer {
    public static void main (String [] args){
        int [ ] arr = {1,2,0,0,4,5,6,7,0,9};
        moveZeroestwo(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void moveZeroestwo(int [] arr){
        int i = -1;
        for(int j = 0 ; j<arr.length;j++){
            if(arr[j]==0){
                i = j;
                break;
            }
        }


        for(int k = i+1 ;k<arr.length;k++){

            if(arr[k] != 0){
                swap(arr,i,k);
                i++;
            }
        }
    }
    static void swap (int []arr,int start ,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
