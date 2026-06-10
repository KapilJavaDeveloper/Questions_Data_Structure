import java.util.Arrays ;
public class _17_Reverse_Words_Of_String{
    public static void reverse(String str){
        if(str==null || str.trim().isEmpty() ){
            // return ""  ;
        }

        String[] words = str.trim().split("\\s+") ;

        StringBuilder s = new StringBuilder() ;

        for(int i=words.length-1 ; i>=0 ; i--){
            s.append(words[i]) ;

            if(i!=0){
                s.append(" ") ;
            }
        }



        System.out.println(Arrays.toString(words)) ;
        System.out.println("Reverse word String be: " + s) ;
    
    }
    public static void main(String [] args){
        String input = "Hello world from Java";

        System.out.println("String be: "+ input) ;
        reverse(input) ;

    }
}