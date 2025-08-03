package PracticeBinarySearch;

public class CeilinSortedArray {
    public static void main(String [] args){
        int [] arr = {1,2,8,10,11,12,19};
        int target = 5;
        System.out.println(ceilElement(arr,target));

    }
    public static int ceilElement(int [] arr, int x){
        int answer = -1;
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]>= x){
                answer = mid;
                end = mid-1;

            }else{
                start = mid+1;
            }
        }
        return answer;
    }
}
