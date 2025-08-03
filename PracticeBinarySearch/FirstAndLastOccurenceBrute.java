package PracticeBinarySearch;
import java.util.*;
public class FirstAndLastOccurenceBrute {
    public static void main (String [] args){
        int [] arr ={1,2,2,3,3,3,4,5,6,7,9};
        int target = 3;
        int [] value;
        value = firstLast(arr,target);
        System.out.println(Arrays.toString(value));
    }

    public static int []  firstLast(int [] arr, int target){

        int []answer = {-1,-1};
        int first = -1;
        int last = -1;
        if(target>arr[arr.length-1]){
            return answer;
        }
        for(int i = 0; i<arr.length ;i++){

            if(arr[i]==target){
                if(first == -1){
                    first = i;
                    last = i;
                }else{
                    last = i;
                }


            }
        }

        answer[0]= first;
        answer[1]= last;
        return answer;

    }
}
