import java.util.Stack ;
public class _18_Valid_Parenthesis {

    public static boolean valid_Parenthesis(String str){

        Stack<Character> stack = new Stack<>() ;
        
        for(int i=0 ; i<str.length() ; i++){
            char c = str.charAt(i) ;

            if(c=='(' || c=='{' || c=='['){
                stack.push(c) ;
            }
            else{
                if(stack.isEmpty()){
                    return false ;
                }

                char top = stack.pop() ;

                if(c==')' && top !='(' || c=='}' && top !='{' || c==']' && top!='['){
                    return false ;
                }
            }

        }

        return stack.isEmpty() ;

    }

    public static void main(String [] args){

        System.out.println("Valid Parenthesis Program") ;

        String s1 = "()[]{}";
        String s2 = "(]";
        String s3 = "([{}])";

        System.out.println("String "+s1 + " be valid parenthesis: "+ valid_Parenthesis(s1));
        System.out.println("String "+s2 + " be valid parenthesis: "+ valid_Parenthesis(s2));
        System.out.println("String "+s3 + " be valid parenthesis: "+ valid_Parenthesis(s3));


    
    }
    
}
