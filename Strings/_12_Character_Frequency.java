import java.util.Map ;
import java.util.HashMap ;
public class _12_Character_Frequency {
    public static void main(String [] args){
        System.out.println("Character Frequency Program: ") ;

        String str = "programming"  ;

        Map<Character,Integer> set = new HashMap<>()  ;

        for(int i=0; i<str.length() ; i++){

            set.put(str.charAt(i) , set.getOrDefault(str.charAt(i) , 0)+1) ;


        }

        System.out.println("Frequency of characters in String be: ") ;

        for(Map.Entry<Character, Integer> element :set.entrySet()){

            System.out.println(element.getKey() + " : " + element.getValue()) ;

            

        }
        
    }
    
}
