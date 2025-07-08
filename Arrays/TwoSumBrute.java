package Arrays;
import java.util.Arrays;
public class TwoSumBrute {
    public static void main(String [] args){

        int [] arr = {2,7,11,15};
        int target = 9;
        

        System.out.println(Arrays.toString(twoSum(arr,target)));

    }

    static int []  twoSum(int [] nums,int target){

        // taking a new array of size two
        int [] answer = new int [2];

        // traversing for two loops and making pairs

        for(int i =0; i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    answer[0]= i;
                    answer[1] = j;
                    break;
                }
            }
        }

        return answer;
    }
}
