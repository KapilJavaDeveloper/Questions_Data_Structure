import java.util.Map ;
import java.util.LinkedHashMap ;
public class _7_First_Non_Repeating_Character {

    public static Character findFirstNonRepeating(String str){

        Map<Character, Integer> charCount = new LinkedHashMap<>() ;

        for(char ch: str.toCharArray()){

            charCount.put(ch , charCount.getOrDefault(ch,0) +1) ;
        }

        for(Map.Entry<Character, Integer> entry : charCount.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey() ;
            }
        }

        return null ;
    }
    public static void main(String [] args){
        String input = "swiss" ;
        System.out.println("String be: " + input) ;

        Character result = findFirstNonRepeating(input) ;

        if(result ==null){
            System.out.println("No Non repeating character in string") ;
        }
        else{
            System.out.println("First Non repeating character in string be: " + result) ;
        }

    }
    
}
