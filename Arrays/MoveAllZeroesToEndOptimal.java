package Arrays;

import java.util.Arrays;

public class MoveAllZeroesToEndOptimal {
    public static void main(String [] args){
        int [] arr = {1, 2, 0, 4, 3, 0, 5, 0};
       zeroesEnd(arr);
       System.out.println(Arrays.toString(arr));
    }

    static void zeroesEnd(int [] arr){

        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                arr[count]= arr[i];
                count++;
            }
        }
        for(int j = count ;j<arr.length;j++){
            arr[j] = 0;
        }
    }
}
