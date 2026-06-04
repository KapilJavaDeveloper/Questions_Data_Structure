
import java.util.Arrays ;
public class _4_Count_Words{
    public static void main(String [] args){
        System.out.println("Count the words in String Program -> ") ;

        String str = "Java is a powerful programming language";

        String[] words = str.trim().split("\\s") ;
        System.out.println(Arrays.toString(words)) ;
        System.out.println("Number of words in string be: " + words.length) ;
    }
}