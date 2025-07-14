package PracticeWeek.July14;

public class SecondLargestElementinArray {
    public static void main(String [] args){

        int [] emptyArray = {};
        int [] singleValue ={65 };
        int [] array = {10,9,56,72,56,91,99};

        System.out.println(secondLargest(emptyArray));
        System.out.println(secondLargest(singleValue));
        System.out.println(secondLargest(array));

    }

    static int secondLargest(int [] arr){

        // If array is empty or having only One Value

        if(arr.length<2){

            return -1;

        }

        int largest = arr[0];
        int slargest = Integer.MIN_VALUE;

        for(int i = 1 ;i <arr.length;i++){

            if(arr[i]>largest){
                slargest = largest;
                largest = arr[i];
            }
            else if (arr[i] >slargest && arr[i] != largest){
                slargest = arr[i];
            }
        }


        return  slargest;

        
    }
}
