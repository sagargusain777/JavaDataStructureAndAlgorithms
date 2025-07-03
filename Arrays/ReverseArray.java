package Arrays;
import java.util.Arrays;
public class ReverseArray {
    public static void main(String []args){
        int [] arr ={1,2,3,4,5,6};
        int [] arrodd ={1,2,3,4,5,6,7};
        reverse(arr);
        reverse(arrodd);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrodd));
    }
     static void reverse(int [] nums){

        for(int i=0;i<nums.length/2;i++){

            int temp = nums[i];
            nums[i] = nums[nums.length-1-i];
            nums[nums.length-1-i] = temp;
        }
        
    }
}
