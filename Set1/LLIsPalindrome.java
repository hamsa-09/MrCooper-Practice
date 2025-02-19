import java.util.*;

public class LLIsPalindrome {
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next=null;
        }
    }

    public Node root;
    public void insert(int val){
        root=insert(root,val);
    }
    private Node insert(Node root,int val){
        Node node=new Node(val);
        if(root==null){
            return node;
        }
        Node curr=root;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=node;
        return root;
    }
    public boolean isPalindrome(Node root){
        Stack<Integer> st=new Stack();
        Node curr=root;
        while(curr!=null){
            st.push(curr.val);
            curr=curr.next;
        }
        curr=root;
        while(curr!=null){

            if(st.pop()!=curr.val)return false;
            curr=curr.next;
        }

        return true;
    }
    public static void main(String[] args) {
        LLIsPalindrome ll = new LLIsPalindrome();
        ll.insert(2);
        ll.insert(3);
        ll.insert(2);
        ll.insert(2);
        if(ll.isPalindrome(ll.root)){
            System.out.println("True");
        }
        else
        System.out.println("False");
    }
}
