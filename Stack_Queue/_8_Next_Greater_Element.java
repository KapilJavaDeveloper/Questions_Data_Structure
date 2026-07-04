import java.util.Arrays ;
import java.util.Stack ;
public class _8_Next_Greater_Element {

    public static void next_Greater_Elements(int [] arr){
        Stack<Integer> stack = new Stack<>()  ;

        for(int i= arr.length-1 ; i>=0 ; i--){

            if(!stack.isEmpty() && stack.peek() <= arr[i]){
                stack.pop() ;
            }
            if(stack.isEmpty()){
                System.out.println(arr[i] + " -> " + -1) ;
            }
            else{
                System.out.println(arr[i] + " -> " + stack.peek()) ;
            }

            stack.push(arr[i]) ;
        }
    }
    public static void main(String [] args){
        System.out.println("8 Program for Next Greater Element ") ;

         int[] arr = {4, 5, 2, 25};
        
         System.out.println("Array of Elements be: " + Arrays.toString(arr)) ;

         System.out.println("Next Greater Element be: ") ;

         next_Greater_Elements(arr) ;
    
    }
    
}