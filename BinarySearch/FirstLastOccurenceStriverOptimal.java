package BinarySearch;

import java.util.Arrays;

public class FirstLastOccurenceStriverOptimal {
    public static void main(String [] args){
        int [] arr = {5,7,7,8,8,10};
        int target = 8;
        int [] answer = new int [2];
        int firstValue = firstOccurence(arr,target);
        int lastValue = lastOccurence(arr,target);
        answer[0] = firstValue;
        answer[1] = lastValue;
        System.out.println(Arrays.toString(answer));
        int [] arr2 = {5,7,7,8,8,10};
        int target2 = 6;
        int [] answer2 = new int [2];
        int firstValue2 = firstOccurence(arr2,target2);
        int lastValue2 = lastOccurence(arr2,target2);
        answer2[0] = firstValue2;
        answer2[1] = lastValue2;
        System.out.println(firstValue2);
        System.out.println(lastValue2);
        System.out.println(Arrays.toString(answer2));



    }


    public static int firstOccurence(int [] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int firstOccurence = -1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid]>= target){
                firstOccurence = mid;
                end = mid -1;
            }else{
                start = mid+1;
            }
        }
        // Checking that first occurence  returns hypothetical index or index does not match with the target
        if(firstOccurence == arr.length || arr[firstOccurence] != target){
            return -1;
        }
        return  firstOccurence;
    }
    public static int lastOccurence(int [] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int lastOccurence = -1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid]>target){
                lastOccurence = mid;
                end = mid -1;
            }else{
                start = mid+1;
            }
        }
        // giving the index just befor the last occured value
        lastOccurence = lastOccurence-1;
        // Checking that first occurence  returns hypothetical index or index does not match with the target
        if(lastOccurence == arr.length || arr[lastOccurence] != target){
            return -1;
        }
        return  lastOccurence;
    }
}
