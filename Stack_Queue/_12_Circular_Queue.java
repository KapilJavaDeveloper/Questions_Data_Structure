public class _12_Circular_Queue {

    int front ;
    int rear ;
    int size ;
    int capacity ;

    int[] queue ;

    public _12_Circular_Queue(int data){
        this.capacity = data ;
        queue = new int[capacity]  ;
        front = 0 ;
        rear = -1 ;
        size = 0; 

    }

    public void enqueue(int data){
        if(size == capacity){
            System.out.println("Queue is Full") ;
            return ;

        }

        rear = (rear+1) % capacity ;
        queue[rear] = data ;
        size++ ;
        System.out.println("Element " + data + " is inserted in an Queue") ;
    }

    public void dequeue(){
        if(size==0){
            System.out.println("Queue is Empty.") ;
            return ;
        }

        System.out.println("Element " + queue[front] + " is removed from the Queue") ;
        front = (front+1)% capacity ;
        size -- ;

    }

    public void display_Queue(){
        if(size==0){
            System.out.println("Queue is Empty.") ;
            return ;
        }
        System.out.print("Queue be: ") ;

        for(int i=0 ; i<size ; i++){
            System.out.print(queue[(front+i)%capacity] + " ") ;
        }
        System.out.println() ;
    }
    public static void main(String [] args){

        System.out.println("11. Circular Queue Program.") ;

        _12_Circular_Queue obj = new _12_Circular_Queue(5) ;

        obj.enqueue(1);
        obj.enqueue(2);
        obj.enqueue(3);
        obj.enqueue(4);
        obj.enqueue(5);
        
        obj.display_Queue();
        
        obj.dequeue();
        obj.enqueue(6);
        obj.display_Queue();

    }
    
}
