package Arrays;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class arraylist {

    public static void main(String []args) {
        //Method  One of declaration
        List<Integer> list = new ArrayList<>();
        list.add(65);
        list.add(72);
        list.add(97);
        System.out.println(list);


        List<Integer> mylist = new ArrayList<>();
        mylist = Arrays.asList(72,65,64,12,15,72);
        System.out.println(mylist);
    }
}
