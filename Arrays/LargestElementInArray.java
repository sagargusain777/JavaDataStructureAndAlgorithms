package Arrays;

public class LargestElementInArray {
    public static void main(String  [] args){

        int [ ]arr = {95,72,65,10,116,135};

        int largestNumber = largestValue(arr);

        System.out.println( "Largest Element in the Array is :" + largestNumber);

    }

    static int largestValue(int []arr){
        //Take the first index as the largest
        int largest = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]> largest){
                largest = arr[i];
            }
        }

        return largest;
    }
}
