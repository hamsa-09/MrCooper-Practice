import java.util.*;



public class ReverseLinkedList {
    class Node{
        int val;
        Node next;
        public Node(int val) {
            this.val=val;
            this.next=null;
        }
    }
    Node root;
    public void insert(int val){
        root=insert(root,val);
    }
    private Node insert(Node root,int val){
        Node node=new Node(val);
        if(root==null)
        return node;
        Node curr=root;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=node;
        return root;
    }
    public void printLL(){
        Node curr=root;
        while(curr!=null){
            System.out.print(curr.val+" ");
            curr=curr.next;
        }
    }
    public void printReverse(){
        Node curr=root;
        Node prev=null;
        Node last=null;

        while(curr!=null){
            last=curr.next;
            curr.next=prev;
            prev=curr;
            curr=last;
        }
        root=prev;
    }
    public static void main(String[] args) {
        ReverseLinkedList ll=new ReverseLinkedList();
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.insert(5);
        ll.printReverse();
        ll.printLL();

    }
}
