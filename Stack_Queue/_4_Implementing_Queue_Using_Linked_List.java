class Node4{
    int data ;
    Node4 next ;

    public Node4(int data){
        this.data = data ;
        this.next  = null ;
    }
}

class Queue{
    Node4 front ;  
    Node4 rear ;

    public void push(int data){

        Node4 newNode = new Node4(data) ;
        if(rear==null){
            front = newNode ;
            rear = newNode ;
            front.next =rear ;
            return ;
        }

        rear.next = newNode ;
        rear = newNode ;

    }

    public void pop(){
        if(front==null){
            System.out.println("Queue is Underflow.") ;
            return ;
        }
        System.out.println("Front Element "+ front.data + " , is pop out of Queue.") ;


        front = front.next ;

        if(front==null){
            rear = null ;
        }
    }

    public void displayQueue(){
        if(front==null){
            System.out.println("Queue is empty.") ;
            return ;
        }

        Node4 temp = front ;

        while(temp!=null){
            System.out.print(temp.data + " ") ;
            temp = temp.next ;
        }
        System.out.println() ;
    }

}
public class _4_Implementing_Queue_Using_Linked_List {
    public static void main(String [] args){
        System.out.println("4. Program Implementing Queue Using Linked List.") ;

        Queue obj = new Queue() ;

        obj.push(1) ;
        obj.push(2) ;
        obj.push(3) ;

        obj.displayQueue() ;

        obj.pop();
        obj.displayQueue();

    }
    
}