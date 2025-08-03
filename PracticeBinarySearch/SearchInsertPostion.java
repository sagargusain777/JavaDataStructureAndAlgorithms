package PracticeBinarySearch;

public class SearchInsertPostion {
    public static void main(String  [] args){
        int [] arr ={1, 3, 5, 6};
        int k = 2;
        System.out.println(searchPostion(arr,k));

    }

    public static int searchPostion(int [] arr, int k){

        int answer = arr.length;
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid]>= k){
                answer = mid;
                end = mid-1;
            }else{
                start = mid +1;
            }
        }
        return  answer;
    }
}
