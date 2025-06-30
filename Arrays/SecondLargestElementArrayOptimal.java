package Arrays;

public class SecondLargestElementArrayOptimal {

    public static void main(String [] args){
        int [] arr2 = {1, 8, 7, 56, 90};
        int [] emptyarray = {};
        int [] arr = {64};
        int [] arr3 = {74,95,92,64,99,24,98};
        System.out.println(secondlargest(arr));
        System.out.println(secondlargest(emptyarray));
        System.out.println(secondlargest(arr3));
        System.out.println(secondlargest(arr2));

    }

    static int secondlargest(int []arr){

        int largest = Integer.MIN_VALUE;
        int slargest = Integer.MIN_VALUE;

        if(arr.length ==0 || arr.length < 2 ){
            return -1 ;

        }
        for(int i = 0 ;i<arr.length ; i++){

            if(arr[i]>largest){
                slargest = largest ;
                largest = arr[i];
            }
            if(arr[i]>slargest && arr[i] !=largest){
                slargest = arr[i];
            }
        }
        return slargest;

    }


}
