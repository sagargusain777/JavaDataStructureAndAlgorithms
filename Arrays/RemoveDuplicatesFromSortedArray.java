package Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String [] args){
        int [ ] nums = {1,1,1,2,2,2,2,3,3,4,4,4,5};

        System.out.println(removeDuplicates(nums));

    }

    public static int removeDuplicates(int [] arr){
        // taking a pointer at index 0

        int j = 0;

        // Taking a loop  which start from one since the first element is on the place
        //Also we should start the loop from  j+1  , so that every time we will not start from 1 since let say index 1 element comes in the place so why to watch it again
        for(int i = j+1;i<arr.length;i++){

            if(arr[i] != arr[j]){
                j++;
                arr[j] = arr[i];
            }
        }
        return  j+1;



    }
}
