package PracticeBinarySearch;
//smallest index which is greater than or equal to the target
// target =<arr[element]
public class LowerBound {
    public static void main(String [] args){
        int [] arr1={2,3,7,10,11,11,25};
        int key = 11;
        int value = lowerBoundElement(arr1,key);
        System.out.println(value);

    }

    public static int lowerBoundElement(int [] arr,int target){
        int answer = arr.length;
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start +(end-start)/2;
            if(arr[mid]>= target){
                answer = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }

        }
        return  answer;
    }
}
