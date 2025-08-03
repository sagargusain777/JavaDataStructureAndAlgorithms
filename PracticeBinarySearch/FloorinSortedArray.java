package PracticeBinarySearch;



public class FloorinSortedArray {
    public static void main(String [] args){
        int [] arr ={3,3,4,5,6,6,8};
        int  x = 4;
        System.out.println(floorElement(arr,x));
    }
    public static int floorElement(int []arr, int x){
        int answer = -1;
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]<=x){
                answer = mid;
                start = mid+1;


            }else{
                end = mid-1;
            }
        }
        return answer;
    }
}
