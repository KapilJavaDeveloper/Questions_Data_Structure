class Queue2{
    int maxSize  ;
    int[] queue ;
    int front = 0 ;
    int rear =-1 ;

    public Queue2(int maxSize){
        this.maxSize = maxSize ;
        queue = new int[maxSize] ;

    }

    public void pushData(int data){
        if(rear==maxSize-1){
            System.out.println("Queue is OverFlow") ;
            return ;
        }
        queue[++rear]  = data ;

    }

    public void popData(){
        if(front>rear){
            System.out.println("Queue is Underflow.") ;
            return ;
        }

        System.out.println("Element " + queue[front++] + " removed.") ;

    }

    public void displayQueue(){
        if(front > rear){
            System.out.println("Underflow condition") ;
            return ;

        }

        System.out.print("Queue be: ") ;

        for(int i =front ; i<=rear ; i++){
            System.out.print(queue[i] + " ") ;
        }
        System.out.println() ;

    }
}
public class _2_Queue_Implementation_Using_Array {
    public static void main(String [] args){
        System.out.println("2. Program Implementing Queue Using Array.") ;

        Queue2 obj = new Queue2(4) ;

        obj.pushData(1);
        obj.pushData(2);
        obj.pushData(3);
        obj.pushData(4);
        
        obj.displayQueue();
        
        obj.popData();
        obj.displayQueue();

        obj.popData();
        obj.displayQueue();
        
        obj.popData();
        obj.displayQueue();

        
    }
    
}
