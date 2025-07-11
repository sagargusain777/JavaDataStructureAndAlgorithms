package Arrays;
import java.util.ArrayList;
import java.util.Arrays;
public class MoveAllZeroesToEnd {
    public static void main ( String [] args){

        int [] arr = {1,2,0,0,4,5,6,7,0,9};

        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i =0 ; i<arr.length;i++){
            if(arr[i] != 0){

                temp.add(arr[i]);

            }
        }
        int tempLength = temp.size();
        System.out.println(temp.get(0));
        for(int j = tempLength;j<arr.length;j++){
            temp.add(0);
        }

        System.out.println(temp);
    }
}
