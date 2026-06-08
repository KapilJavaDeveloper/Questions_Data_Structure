import java.util.Map ;
import java.util.HashMap ;
public class _14_Longest_Substring {
    public static void main(String [] args){
        System.out.println("Longest Substring in a String.") ;

        String str = "abcabcbb" ;

        System.out.println("String be: " + str)  ;

        Map<Character, Integer> map = new HashMap<>()  ;

        int start = 0;
        int maxStart = 0;
        int maxLength = 0;

        for(int end=0 ; end<str.length() ; end++){
            char currentChar = str.charAt(end) ;

            if(map.containsKey(currentChar)){
                start = Math.max(start , map.get(currentChar)+1) ;
            }

            map.put(currentChar , end) ;

            if(end-start + 1 > maxLength){
                maxLength = end-start+1 ;
                maxStart = start ;

            }

        }

        System.out.println("Longest Substring in a String be: "+ str.substring(maxStart, maxStart+maxLength)) ;
        System.out.println("Length of Longest Substring in string be: "+ maxLength) ;

    }
    
}
