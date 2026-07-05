import java.util.Stack ;
public class _11_Minimum_Stack{

    Stack<Integer> stack ;
    Stack<Integer> minStack ;

    public _11_Minimum_Stack(){
        stack = new Stack<Integer>() ;
        minStack = new Stack<Integer>() ;
    }

    public void push(int data){
        stack.push(data) ;

        if(minStack.isEmpty() || data <= minStack.peek()){
            minStack.push(data) ;
        }
    }

    public void peek(){
        if(stack.isEmpty()){
            System.out.println("Stack is Empty.") ;
            return ;
        }
        System.out.println("Peek Element of Stack be:  "+ stack.peek()) ;
    }

    public void pop(){

        if(stack.isEmpty()){
            System.out.println("We cannot pop from Empty Stack.") ;
            return ;
        }

        int top = stack.pop() ;
        System.out.println("Element "+top  + " is removed from the Stack.") ;

        if(top == minStack.peek()){
            minStack.pop() ;
        }


    }

    public void getMin(){
        if(minStack.isEmpty()){
            System.out.println("No minimum element because stack is empty.") ;
            return ;
        }
        System.out.println("Minimum Element in Stack be: "+ minStack.peek()) ;
    }


    public static void main(String [] args){
        System.out.println("11. Program for Minimum Stack.") ;

        _11_Minimum_Stack obj = new _11_Minimum_Stack()  ;
        
        obj.push(10);
        obj.push(2);
        obj.push(30);
        obj.push(100);

        System.out.println("Stack be: " + obj.stack) ;

        obj.peek() ;

        obj.getMin();
        
        obj.pop() ;

        obj.getMin();

    }
}