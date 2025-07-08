package Arrays;

public class CheckIfArrayIsSorted {
    public static void main (String [] args){
        int [ ]arr = {1,2,32,45,65,95};
        int [ ]arrf = {24,1,45,65,23};

        System.out.println(sortedArray(arr));
        System.out.println(sortedArray(arrf));
    }

    static boolean  sortedArray(int [] arr){
        //Taking a flag vairable put it intially true
        boolean flag = true;
        // false condition
        for(int i = 1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                flag = false;
                break;
            }
        }

        return flag;

    }
}
