package LinkedLists.Singly_Linked_List;

public class InsertionsList {

    private  Node HeadNode;
    public static void main(String[] args) {
        InsertionsList list=new InsertionsList();
        list.push(1);
        list.push(2);
        list.push(3);
        list.appendAtEnd(4);
        list.appendAtEnd(6);
        list.afterNode(list.HeadNode.next,8);
        list.insertAfterData(2,5);
        list.insertAfterData(4,9);
        System.out.println("LIST VALUES");
        list.printList();

    }

    //inserting at start of list
    public  void push(int data){
        //Time complexity is O(1)
        //creating a new node

        Node newNode=new Node(data);
        newNode.next=HeadNode;
        HeadNode=newNode;

    }

    //Adding Node after given Node Entered  => O(1)
    public void afterNode(Node prevNode , int data){
        if(prevNode==null){
            System.out.println("Previous node cannot be null");
          return;
        }
        Node newNode=new Node(data);
        newNode.next=prevNode.next;
        prevNode.next=newNode;
    }

    public void insertAfterData(int given,int data){
        Node firstNode=HeadNode;
        while(firstNode.Data!=given){
            firstNode=firstNode.next;
        }
        Node newNode=new Node(data);
        newNode.next=firstNode.next;
        firstNode.next=newNode;

    }
    public void appendAtEnd(int data){
        //Time Complexity is O(1)

        Node newNode=new Node(data);
        if(HeadNode==null) {
            HeadNode=newNode;
        }

        Node last=HeadNode;
        while(last.next!=null){
            last=last.next;
        }
        last.next=newNode;
        newNode.next=null;
    }

    public void printList(){
        Node last=HeadNode;
        if(HeadNode==null){
            System.out.println("List is Empty");
        }
        while(last!=null){
            System.out.println(last.Data);
            last=last.next;
        }
    }

    class Node{
        Node(int Data){

            this.Data=Data;
            next=null;
        }
        private int Data;
        private Node next;
    }

}
