package BinarySearch;
import java.util.Arrays;
public class FirstAndLastOccurenceBrute {
    public static void main(String [] args){
        int [] arr = {1,2,3,5,6,6,6,7,8};
        int target = 6;
        int [] arr2 = {};
        int target2 = 9;
        int [] finalArray = firstLastOccurence(arr,target);
        int [] finalArray2 = firstLastOccurence(arr2,target2);
        System.out.println(Arrays.toString(finalArray));
        System.out.println(Arrays.toString(finalArray2));
    }
    public static int[]  firstLastOccurence(int [] arr, int target){
        int [] answer ={-1,-1};
        if(arr.length == 0 ){
            return answer;
        }
        for(int i =0 ; i<arr.length ;i++){
            if(arr[i]==target){

                if(answer[0]==-1){
                    answer[0] = i;
                    answer[1]= i;
                }else{
                    answer[1] = i;
                }


            }
        }
        return answer;
    }
}
