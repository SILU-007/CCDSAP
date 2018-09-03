package LinkedLists.Singly_Linked_List;

public class BasicList {

    private  Node HeadNode;
    public static void main(String[] args) {


    }

    //inserting at start of list
    public  void push(int data){
        //Time complexity is O(1)
        //creating a new node
        Node newNode=new Node(data);
        newNode.next=HeadNode;
        HeadNode=newNode;

    }

    //Adding Node after given Node Entered


    class Node{
        Node(int Data){
            this.Data=Data;
        }
        private int Data;
        private Node next;
    }

}
