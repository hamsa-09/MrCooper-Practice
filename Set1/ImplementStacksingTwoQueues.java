import java.util.*;

class Implementstack{
    public Queue<Integer>q1;
    public Queue<Integer>q2;
    public Implementstack(){
        q1=new LinkedList<>();
        q2=new LinkedList<>();
    }

    public void push(int x){
        q2.add(x);
        while(!q1.isEmpty()){
            q2.add(q1.poll());
        }
        Queue<Integer> temp=q1;
        q1=q2;
        q2=temp;
    }
    public void pop(){
        if(q1.isEmpty())return;
        System.out.print(q1.poll());
    }
    public void top(){
        if(q1.isEmpty())return;
        System.out.print(q1.peek());
    }
    public boolean isEmpty(){
        return q1.isEmpty();
    }

}
public class ImplementStacksingTwoQueues {

    public static void main(String[] args) {
        Implementstack stack=new Implementstack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.top();

        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}


// import java.util.*;
// import java.util.LinkedList;

//  class StackImplementation{
//     Queue<Integer> queue1;
//     Queue<Integer> queue2;

//     StackImplementation(){
//         queue1 = new LinkedList<>();
//         queue2 = new LinkedList<>();
//     }

//     public void push(int x){
//         queue2.add(x);

//         while(!queue1.isEmpty()){
//             queue2.add(queue1.poll());
//         }

//         Queue<Integer> temp = queue1;
//         queue1 = queue2;
//         queue2 = temp;
//     }

//     public void pop(){
//         if(queue1.isEmpty()) return;
//         System.out.print(queue1.poll());
//     }

//     public void top(){
//         if(queue1.isEmpty()) return ;
//         System.out.println(queue1.peek());
//     }

//     public void isEmpty(){
//         if(queue1.isEmpty()) {
//             System.out.println(true);
//         }else{
//             System.out.println(false);
//         }
//     }
// }

// public class ImplementationOfStack {
//     public static void main(String[] args) {
//         StackImplementation stackImplementation = new StackImplementation();
//         stackImplementation.push(1);
//         stackImplementation.push(2);
//         stackImplementation.push(3);
//         stackImplementation.pop();
//         stackImplementation.top();



//     }
// }
