package LinkedList;

public class SinglyLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public SinglyLinkedList() {
        this.size = 0;
    }
    public  void insertFirst(int value){
        Node newNode = new Node (value);
        newNode.next = head;
        head = newNode;
        if(tail == null){
            tail = newNode;
        }
        size = size+1;
    }



    public void display(){
       Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.print("END");
    }

    public void insertLast(int value){
        if(head== null){
            insertFirst(value);
        } else{
            Node newNode = new Node(value);
            tail.next = newNode;
            newNode = tail;
            size++;
        }

    }

    public  class Node {

        private int value ;
        private Node next ;

        public Node(int value1){
            this.value = value1;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }


}
