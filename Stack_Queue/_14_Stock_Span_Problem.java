import java.util.Arrays ;
import java.util.Stack ;
public class _14_Stock_Span_Problem{

    public static void stack_span(int[] arr){

        int[] result = new int[arr.length] ;
        Stack<Integer> stack = new Stack<Integer>()  ;

        result[0] = 1 ;
        stack.push(0)  ;

        for(int i=1 ; i<arr.length ; i++){

            while(!stack.isEmpty() && arr[stack.peek()] <= arr[i]){
                stack.pop() ;
            }

            if(stack.isEmpty()){
                result[i] = i+1 ;
            }
            else{
                result[i]  = i-stack.peek()  ;
            }

            stack.push(i)  ;

        }

        for(int i=0; i<arr.length ; i++){
            System.out.print(result[i] + " ") ;
        }

    }
    public static void main(String [] args){
        System.out.println("14 Program for Stack Span Problem ") ;

        int[] arr = {100 ,80 ,60 ,70, 60, 75, 85} ;
        System.out.println("Array be: " + Arrays.toString(arr)) ;

        stack_span(arr) ;

    }
}