package Practise;

public class LargestElement {
    public static void main (String [] args){
        int [] nums = {10,20,30,40,60,90};

        System.out.println(largestElement(nums));
    }

    static int largestElement(int []arr){
        int largest = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }

        return largest;
    }
}
