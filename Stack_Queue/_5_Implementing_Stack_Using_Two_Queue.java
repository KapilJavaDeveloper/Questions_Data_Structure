import java.util.Queue ;
import java.util.LinkedList ;


public class _5_Implementing_Stack_Using_Two_Queue{

    Queue<Integer> q1 = new LinkedList<>()  ;

    Queue<Integer> q2 = new LinkedList<>()  ;

    public void push(int data){
        q2.add(data) ;

        while(!q1.isEmpty()){
            q2.add(q1.remove()) ;
        }

        Queue<Integer> temp = q1 ;

        q1 = q2 ;
        q2 = temp ;

    }

    public void pop(){

        if(q1.isEmpty()){
            System.out.println("Stack is Empty.") ;
            return ;
        }

        System.out.println("Element "+ q1.remove() + " is removed fro the Stack.") ;

    }

    public void peek(){

        if(q1.isEmpty()){
            System.out.println("Stack is empty.") ;
            return ;
        }

        System.out.println("Peek element be: "+ q1.peek()) ;
    }

    public static void main(String [] args){
        System.out.println("Program 5. Implementing Stack Using Two Queue.") ;

        _5_Implementing_Stack_Using_Two_Queue obj = new _5_Implementing_Stack_Using_Two_Queue()  ;

        obj.push(1) ;
        obj.push(2) ;
        obj.push(3) ;
        obj.push(4) ;
      

        obj.pop() ;
        obj.peek() ;

    }
}