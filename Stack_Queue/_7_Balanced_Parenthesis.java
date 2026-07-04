import java.util.Stack ;
public class _7_Balanced_Parenthesis{

    public static boolean balanced_Parenthesis(String str){

        Stack<Character> stack = new Stack<>()  ;

        for(char ch : str.toCharArray()){
            if(
                ch == '{' ||
                ch == '[' ||
                ch == '(' 
            ){
                stack.push(ch) ;
            }
            else if(
                ch == '}' ||
                ch == ']' ||
                ch == ')' 
            ){

                if(stack.isEmpty()){
                    return false ;
                }

                char top = stack.pop() ;

                if(
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[') ||
                    (ch == ')' && top != '(') 
                ){
                    return false ;
                }
            }


        }
        return stack.isEmpty() ;
    }
    public static void main(String [] args){
        System.out.println("7. Program for Balanced Parenthesis.") ;

            String input = "{[()]}";

            System.out.println("String of Parenthesis be: " + input) ;

            if(balanced_Parenthesis(input)){
                System.out.println("Balanced Parenthesis.") ;
            }
            else{
                System.out.println("Unbalanced Parenthesis.") ;
            }

    }
}