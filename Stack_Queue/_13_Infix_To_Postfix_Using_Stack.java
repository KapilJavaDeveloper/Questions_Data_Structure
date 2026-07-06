import java.util.Stack ;
public class _13_Infix_To_Postfix_Using_Stack {

    public static boolean is_Operand(char c){
        return Character.isLetterOrDigit(c) ;
    }

    public static int precedence(char character){

        switch(character){
            case '-':
               return 1 ;
            case '+' :
                return 1;
            case '*' :
                return 2 ;
            case '/' :
                return 2 ;
            case '^' :
                return 3 ;

        }
        return -1 ;
    }

    public static String infix_To_Postfix(String str){

        StringBuilder result = new StringBuilder()  ;
        Stack<Character> stack = new Stack<Character>()  ;
        


        for(int i=0 ; i<str.length() ; i++){
            char character = str.charAt(i)  ;

            if(is_Operand(character)){
                result.append(character) ;
            }
            else if(character == '('){
                stack.push(character) ;

            }
            else if(character == ')'){
                while(!stack.isEmpty() && stack.peek() != '('){
                    result.append(stack.pop()) ;
                    
                }
                stack.pop() ;
            }
            else{

                while(!stack.isEmpty() && precedence(character) <= precedence(stack.peek())){
                    result.append(stack.pop()) ;
                }
                stack.push(character) ;
                
            }
  
        }

        while(!stack.isEmpty()){
            result.append(stack.pop()) ;
        }

        return  result.toString() ;
    }
    public static void main(String [] args){
        System.out.println("13. Program to convert Infix Expression into Postfix.") ;

        String expression = "A+B*(C-D)/E";

        System.out.println("Infix Expression be: " + expression) ;

        String str = infix_To_Postfix(expression) ;
        System.out.println("Postfix Expression be: " + str) ;

    }
    
}