import java.util.Map ;
import java.util.HashMap ;

public class _8_Anagram_Strings {

    public static boolean isAnagram(String s1 , String s2){

        if(s1.length() != s2.length()){
            return false ;
        }

        Map<Character , Integer> map = new HashMap<>() ;

        for(Character c : s1.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1) ;
        }

        for(Character c: s2.toCharArray()){

            if(!map.containsKey(c)){
                return false ;
            }

            map.put(c , map.get(c)-1) ;

            if(map.get(c)==0){
                map.remove(c) ;
            }

        }

        return map.isEmpty() ;



    }
    public static void main(String [] args){

        System.out.println("Anagram Strings") ;

        String s1 = "listen" ;
        String s2 = "silent" ;

        System.out.println("First String be: " + s1);
        System.out.println("Second String be: " + s2);

        boolean result = isAnagram(s1,s2) ;

        if(result){
            System.out.println("Anagram Strings.") ;
        }
        else{
            System.out.println("Not Anagram Strings.") ;
        }


    }
    
}
