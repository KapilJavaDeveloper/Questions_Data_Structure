import java.util.Queue ;
import java.util.LinkedList ;
import java.util.Stack ;

public class _10_Reverse_Queue {
    public static void main(String [] args){

        System.out.println("10 Program to reverse a Queue.") ;

        Queue<Integer> queue = new LinkedList<Integer>() ;

        queue.add(1) ;
        queue.add(2) ;
        queue.add(3) ;
        queue.add(4) ;

        System.out.println("Original Queue be: " + queue) ;

        Stack<Integer> stack = new Stack<Integer>()  ;

        while(!queue.isEmpty()){
            stack.add(queue.remove()) ;
        }

        while(!stack.isEmpty()){
            queue.add(stack.pop()) ;
        }

        System.out.println("Reversed Queue be: " + queue ) ;

    }
    
}
