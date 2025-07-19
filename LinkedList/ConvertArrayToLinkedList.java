package LinkedList;

public class ConvertArrayToLinkedList {


    public static class Node{
        int value;
        Node next;

        public Node (int value1){
            this.value = value1;

        }
        public Node (int value1,Node next1){
            this.value = value1;
            this.next = next1;
        }
    }

    public static Node convertArraytoLL(int [] arr){
        Node  head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;

        }

        return  head;
    }

    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String [] args){
        int [] arr = {16,25,32,94};
        Node answer = convertArraytoLL(arr);
        display(answer);
        int [] arr1 = {16,25,32,98};
        Node answer1 = convertArraytoLL(arr1);
        display(answer1);

    }
}
