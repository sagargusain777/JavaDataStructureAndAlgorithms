package PracticeBinarySearch;

public class UpperBound {
    public static void main(String [] args){
        int [] arr1 = {2, 3, 7, 10, 11, 11, 25};
        int target1 = 11;
        int []arr2 = {2, 3, 7, 10, 11, 11, 25};
        int target2 = 100;
        System.out.println(upperBoundElement(arr1,target1));
        System.out.println(upperBoundElement(arr2,target2));

    }
    public static  int upperBoundElement(int[] arr, int target){
        int answer = arr.length;
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]>target){
                answer = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return answer;
    }
}
