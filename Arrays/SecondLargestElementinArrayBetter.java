package Arrays;
// Quetion :- Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.
//Note: The second largest element should not be equal to the largest element.
public class SecondLargestElementinArrayBetter {
    public static void main(String[] args) {

        int [] arr = {1, 8, 7, 56, 90};
        int [] emptyarray = {};
        int [] duplicatearray = {10,10,10,10};
        int [] singlearray = {72};


        System.out.println(secondlargestelement(arr));
        System.out.println(secondlargestelement(emptyarray));
        System.out.println(secondlargestelement(duplicatearray));
        System.out.println(secondlargestelement(singlearray));

    }
   public static int secondlargestelement(int[]arr) {
       int largest = Integer.MIN_VALUE;
       int slargest = Integer.MIN_VALUE;

       if(arr.length == 0 || arr.length<2){
           return -1;
       }

       // finding the First largest element in the array
       for (int i = 0;i <arr.length;i++){

           if(arr[i]>largest){
               largest = arr[i];
           }

       }

       //Finding the second largest  element int the array

       for(int j = 0; j<arr.length;j++){
           if( arr[j]>slargest  && arr[j] != largest){

               slargest = arr[j];
           }

       }

       // Also if there is no second largest element  in the array
       if(slargest == Integer.MIN_VALUE){
           return  -1;
       }
       return slargest;
       


   }
}
