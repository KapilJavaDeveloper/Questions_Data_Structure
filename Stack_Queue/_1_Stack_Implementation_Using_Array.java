class Stack{
    int maxSize ;
    int[] stack ;

    int top = -1 ;


    public Stack(int data){
        this.maxSize = data ;
        stack = new int[maxSize] ;
    }

    public void pushData(int data){
        if(top==maxSize){
            System.out.println("Stack is Overflow") ;
            return ;
        }

        stack[++top] = data ;
    }

    public void popData(){
        if(top==-1){
            System.out.println("Stack is Underflow.") ;
            return ;
        }

        System.out.println("Element " +stack[top--] + " pop from the Stack.  "  ) ;

    }

    public void peekData(){
        if(top==-1){
            System.out.println("Stack is Empty") ;
            return ;
        }

        System.out.println("Peek Element be: " + stack[top]) ;

    }

    public void displayStack(){
        if(top==-1){
            System.out.println("Stack is Empty.") ;
            return ;
        }

        System.out.print("Stack be: ") ;
        for(int i= top ; i>=0 ; i--){
            System.out.print(stack[i] + " ") ;
        }
        System.out.println() ;
    }

}


public class _1_Stack_Implementation_Using_Array{

    public static void main(String [] args){
        System.out.println("1. Program for Implementation of Stack Using Array") ;

        Stack obj = new Stack(5) ;

        obj.pushData(1);
        obj.pushData(2);
        obj.pushData(3);
        obj.pushData(4);

        obj.displayStack();
        
        obj.popData();
        obj.displayStack();

        obj.peekData();

        
    }
}