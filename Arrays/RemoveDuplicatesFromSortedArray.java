package Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String [] args){
        int [ ] nums = {1,1,1,2,2,2,2,3,3,4,4,4,5};

        System.out.println(removeDuplicates(nums));

    }

    public static int removeDuplicates(int [] arr){
        // taking a pointer at index 0

        int i = 0;

        // Taking a loop  which start from one since the first element is on the place
        //Also we should start the loop from  j = 1 , since the first element will be its initial place

        for(int j = 1;j<arr.length;j++){

            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return  i+1;



    }
}
