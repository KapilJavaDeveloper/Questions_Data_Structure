import java.util.HashMap ;
public class _10_Character_Count {

    public static void character_Count(String str){

        HashMap<Character , Integer> hashMap = new HashMap<>() ;

        char[] charArray = str.toCharArray()  ;

        for(char c: charArray){
            hashMap.put(c , hashMap.getOrDefault(c,0) + 1) ;
        }

        for(Character key: hashMap.keySet()){
            System.out.println(key + " -> " + hashMap.get(key)) ;

        }

    }
    public static void main(String [] args){
        System.out.println("10. Character Count Program.") ;

        String str = "programming";
        System.out.println("String be: " + str) ;
        character_Count(str) ;
    }
    
}
