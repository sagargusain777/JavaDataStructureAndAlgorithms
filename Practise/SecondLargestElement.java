package Practise;

public class SecondLargestElement {
    public static void main (String [] args){
        int [] arr = {1,2,3,4,5,8,8,9,13,10};
        int [] duplicates = {10,10,10,10,10};

        int answer = secondlargest(arr);
        System.out.println(answer);
        System.out.println(secondlargest(duplicates));

    }

    static int  secondlargest(int [] arr){
        int largest = arr[0];
        int slargest = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length;i++){
            if(arr[i]>largest){
                slargest = largest;
                largest = arr[i];
            }
            else if(arr[i] != largest && arr[i]>slargest){
                slargest = arr[i];
            }
        }

        if(slargest == Integer.MIN_VALUE){
            return -1;
        }

        return slargest;
    }
}
