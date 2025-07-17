package LinkedList;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public  LL(){
        this.size =0;

    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail== null){

            tail = head;
        }
        size +=1;

    }

      //Display Code for linked list
    public void display (){
        Node temp = head;
        while (temp != null){
        System.out.println(temp.value + " -> ");
        temp.next = temp;
        }
    }





      private class Node{
          int value;
          Node next;

          public Node(int value) {
              this.value = value;
          }

          public Node(int value, Node next) {
              this.value = value;
              this.next = next;
          }
      }
}
