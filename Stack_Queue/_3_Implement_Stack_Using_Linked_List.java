class Node3{
    int data ;
    Node3 next ;

    public Node3(int data){
        this.data = data ;
        this.next = null ;
    }
}

class Stack{
    Node3 top ;

    public void push(int data){
        Node3 newNode = new Node3(data) ;
        newNode.next = top ;
        top = newNode  ;
    }

    public void pop(){
        if(top==null){
            System.out.println("Stack is Underflow.") ;
            return ;
        }

        System.out.println("Top Element "+ top.data + " is pop out of Stack.") ;
        top = top.next ;
    }

    public void peek(){
        if(top==null){
            System.out.println("Stack is Underflow.") ;
            return ;
        }

        System.out.println("Peek Element be: " + top.data) ;
    }

    public void displayStack(){
        if(top==null){
            System.out.println("Stack is Underflow.") ;
            return ;
        }

        System.out.println("Stack be: ") ;
        Node3 temp = top ;

        while(temp !=null){
            System.out.print(temp.data + " ") ;
            temp = temp.next ;
        }
        System.out.println() ;
    }

}
public class _3_Implement_Stack_Using_Linked_List{
    public static void main(String [] args){
        System.out.println("3. Program, Implementing Stack using Linked List") ;

        Stack obj = new Stack()  ;

        obj.displayStack();

        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);

        obj.displayStack();

        obj.pop();
        obj.displayStack();

        obj.peek();
    }
}