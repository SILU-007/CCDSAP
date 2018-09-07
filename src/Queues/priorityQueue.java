package Queues;

public class priorityQueue {

    private Node headNode;

    class Node {
        int data;
        int priority;
        Node next;

        Node(int data, int priority) {
            this.priority = priority;
            this.data = data;
            this.next = null;
        }
    }

    public boolean isEmpty() {
        return headNode == null;
    }

    public void enQueue(int data, int priority) {
        //create a new Node
        Node newNode = new Node(data, priority);

        if(headNode==null){
            headNode=newNode;
            return;
        }
        //check that the first node priority < new  Node priority if yes insert at start
        if (headNode.priority > priority) {

            newNode.next = headNode;
            headNode = newNode;
        } else {
            //traversing the list to find a suitable place
            Node temp = headNode;
            while (temp.next != null && temp.next.priority < priority) {
                temp = temp.next;
            }

            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    public void deQueue() {
        headNode=headNode.next;
    }

    public void printQueue(priorityQueue q) {
        while(!q.isEmpty()){
            System.out.println(headNode.data);
            deQueue();
        }
    }

    public static void main(String[] args) {
        priorityQueue q = new priorityQueue();
        q.enQueue(1, 1);
        q.enQueue(4, 4);
        q.enQueue(12, 12);
        q.enQueue(5, 5);
        q.enQueue(8, 8);
        System.out.println("Printing Priority Queue (decreasing priority):");
        q.printQueue(q);
    }

}
