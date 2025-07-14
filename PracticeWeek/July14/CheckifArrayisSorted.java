package PracticeWeek.July14;

public class CheckifArrayisSorted {

    public static void main(String [] args){

        int [] nums = { 1,2,3,4,10,6};
        int [] nums2 = { 1,2,3,4,6};

        System.out.println(sortedArray(nums));
        System.out.println(sortedArray(nums2));


    }

    static boolean sortedArray(int [] arr){
        boolean flag = true;

        for(int  i =1 ; i<arr.length;i++){

            //False condition
            if(arr[i]<arr[i-1]){
                flag = false;
                break;
            }
        }

        return flag;
    }

}
