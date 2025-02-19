import java.util.*;


class Node{
    int val,height;
    Node left, right;
    Node(int val){
        this.val=val;
        this.height=1;
    }

}
public class TreeTraversal {
    private Node root;
    private int getHeight(Node node){
        if(node==null)return 0;
        return node.height;
    }
    private int getBalance(Node node){
        if(node==null)return 0;
        return getHeight(node.left)-getHeight(node.right);
    }
    public void insert(int val){
    root=insert(root,val);
 }
private Node insert(Node node,int val){
    if(node==null){
        return new Node(val);
    }
    if(val<node.val){
        node.left=insert(node.left,val);
    }
    else if(val>node.val){
        node.right=insert(node.right,val);
    }
    else{
        return node;
    }
    node.height=Math.max(getHeight(node.left),getHeight(node.right))+1;
    int balance=getBalance(node);
//ll
    if(balance >1 && val<node.left.val){
        return rightRotate(node);
    }
//lr
    if(balance >1 && val>node.left.val){
        node.left=leftRotate(node.left);
        return rightRotate(node);
    }
    //rr
    if(balance<-1 && val>node.right.val){
        return leftRotate(node);
    }
    //rl
    if(balance<-1 && val<node.right.val){
        node.right=rightRotate(node.left);
        return leftRotate(node);
    }
    return node;
}
private Node leftRotate(Node x){
    Node y=x.right;
    Node t1=y.left;
    y.left=x;
    x.right=t1;

    x.height=Math.max(getHeight(x.left),getHeight(x.right))+1;
    y.height=Math.max(getHeight(y.right),getHeight(y.right))+1;
    return y;

}
private Node rightRotate(Node x){
    Node y=x.left;
    Node t1=y.right;
    y.right=x;
    x.left=t1;

    x.height=Math.max(getHeight(x.left),getHeight(x.right))+1;
    y.height=Math.max(getHeight(y.right),getHeight(y.right))+1;
    return y;
}
public void inorder(){
    inorder(root);
}
private void inorder(Node node){
    if(node !=null){
        inorder(node.left);
        System.out.print(node.val+" ");
        inorder(node.right);
    }
}
public static void main(String[] args) {
        TreeTraversal avl=new TreeTraversal();
        avl.insert(10);
        avl.insert(20);
        avl.insert(30);
        avl.insert(40);
        avl.insert(50);
        avl.insert(60);
        System.out.println("Inorder:");
        avl.inorder();
}
}
