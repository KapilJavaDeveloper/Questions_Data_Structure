import java.util.Stack ;

public class _6_Queue_Implementation_Using_Two_Stack {

    Stack<Integer> s1 = new Stack<>() ;
    Stack<Integer> s2 = new Stack<>() ;

    public void enque(int data){
        s1.push(data) ;

    }

    public void deque(){
        if(s1.isEmpty()){
            System.out.println("Queue is Empty.") ;
            return ;
        }


        while(!s1.isEmpty()){
            s2.add(s1.pop()) ;
        }
        System.out.println("Element "+ s2.pop() + " is removed from the queue") ;

        while(!s2.isEmpty()){
            s1.add(s2.pop()) ;
        }


    }
    public void peek(){
        if(s1.isEmpty()){
            System.out.println("Queue is Empty.") ;
            return ;
        }

        while(!s1.isEmpty()){
            s2.add(s1.pop()) ;
        }
        System.out.println("Peek Element be:  "+ s2.peek() ) ;

        while(!s2.isEmpty()){
            s1.add(s2.pop()) ;
        }
        
    }

    public void displayQueue(){
        if(s1.isEmpty()){
            System.out.println("Queue is Empty") ;
            return ;
        }

        System.out.print("Queue be: ") ;
        System.out.println(s1) ;
    }
    public static void main(String [] Isskander){
        System.out.println("6. Program Implementing Queue Using Two Stack.") ;

         _6_Queue_Implementation_Using_Two_Stack queue = new  _6_Queue_Implementation_Using_Two_Stack() ;

         queue.enque(1);
         queue.enque(2);

         queue.displayQueue();

         queue.enque(3);
         queue.enque(4);

         queue.displayQueue();
          
         queue.deque();
         queue.displayQueue();
         
         queue.peek();
         queue.displayQueue();


    }
    
}
