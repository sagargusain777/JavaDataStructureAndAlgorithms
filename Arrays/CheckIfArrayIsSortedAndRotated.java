package Arrays;

public class CheckIfArrayIsSortedAndRotated {
    public static void main( String [ ] args){

        int [ ]rotate = {2,3,4,5,1};
        int [] normal = {1,2,3,4,5};
        int [] none  = {2,1,4,5,7,3};
        System.out.println(sortedRotated(rotate));
        System.out.println(sortedRotated(normal));
        System.out.println(sortedRotated(none));
    }

    static boolean  sortedRotated(int [] arr){
        int count = 0;

        //Case 1 When the array is just rotated
        for(int i = 1; i<arr.length;i++){

            if(arr[i]< arr[i-1]){
                count++;
            }
        }
        //Case 2 When the array is not rotated but sorted
        if(arr[arr.length-1]>arr[0]){
            count++;
        }

        return count <=1;
    }
}
