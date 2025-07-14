package PracticeWeek.July14;

public class LargestElementinArray {

    public static void main(String [] args){
        int [] nums  = { 1, 6 , 10, 56 ,94};
        int [] empty = {};
        System.out.println(largest(nums));
        System.out.println(largest(empty));
    }

    static int largest (int [] arr){

        if(arr.length == 0){
            return -1;
        }
        int largest = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }

        return largest;
    }


 }

