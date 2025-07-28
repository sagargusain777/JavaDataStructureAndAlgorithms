package BinarySearch;

import java.util.Arrays;

public class FirstAndLastOccurenceOptimalKunal {
    public static void main ( String [] args){
        int [] arr ={5,7,7,8,8,10};
        int target = 8;
        int [] answer = {-1,-1};
        answer[0]=firstAndLast(arr,target,true);
        answer[1]=firstAndLast(arr,target,false);
        System.out.println(Arrays.toString(answer));

    }

    public static int firstAndLast(int [] arr, int target,boolean type){
        int answer = arr.length;
        int start = 0;
        int end = arr.length-1;
        if(arr.length==0){
            return -1;
        }
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]> target){
                end = mid-1;

            }else if(arr[mid]< target){
                start = mid+1;
            }else{
                answer = mid ;
                if(type){
                    end = mid-1;
                }else{
                    start = mid+1;
                }

            }


        }
        return answer;
    }
}
