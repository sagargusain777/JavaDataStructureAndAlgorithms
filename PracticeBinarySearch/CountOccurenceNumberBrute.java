package PracticeBinarySearch;

public class CountOccurenceNumberBrute {
    public static void main(String [] args){
        int [] arr = {1,1,2,2,3,3,3,5,5,5,5,6,6,7};
        int target = 5;
        int count =0;
        for(int i=0 ;i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }
        }


        System.out.println(count);
    }
}
