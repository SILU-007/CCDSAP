package Queues;

public class QueueSinglyLinkedList {

    private Node headNode;
    private Node rearNode;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }

    public void enqueue(int data){
        Node newNode=new Node(data);
        if(rearNode==null) {
            headNode =rearNode= newNode;
        }
        rearNode.next=newNode;
        rearNode=newNode;
    }
    private void dequeue(){

        if(headNode==null){
            System.out.println("Empty Queue");
        }
        Node first=headNode;
        headNode=headNode.next;
        if(headNode==null){
            rearNode=null;
        }

    }

    public void printList(){
        Node last=headNode;
        if(rearNode==null){
            System.out.println("Queue is empty");
        }

        while (last!=null){
            System.out.println(last.data);
            last=last.next;
        }
    }

    public static void main(String[] args) {

        QueueSinglyLinkedList queue=new QueueSinglyLinkedList();
         queue.enqueue(1);
         queue.enqueue(2);
         queue.enqueue(3);
         queue.enqueue(4);
         queue.enqueue(5);
         queue.enqueue(6);
         queue.dequeue();
         queue.dequeue();
         queue.printList();

    }
}
