package PracticeWeek.July14;

public class CheckifArrayisSortedAndRotated {

    public static void main (String [] args){
        int [] nums = {1,2,3,4,5,6};
        int [] rotatedarray = {3,4,5,1,2,3};
        int [] falsearray = {3,7,5,1,2,3};

        System.out.println(rotatedAndSorted(nums));
        System.out.println(rotatedAndSorted(rotatedarray));
        System.out.println(rotatedAndSorted(falsearray));


    }

    static boolean rotatedAndSorted(int [] arr){

        //let take a count
        int count = 0;
        for(int i=1;i<arr.length; i++){

            if(arr[i]<arr[i-1]){
                count++;
            }
        }

        if(arr[arr.length-1]>arr[0]){
            count++;
        }

        return count<=1;
    }
}
