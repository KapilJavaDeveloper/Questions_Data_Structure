import java.util.Arrays ;
import java.util.List ;
import java.util.HashMap ;
import java.util.ArrayList ;

public class _4_Group_Anagram {

    public static List<List<String>> group_Anagram(String[] arr){

        HashMap<String , List<String> > hashMap = new HashMap<>()  ;

        for(String str : arr){

            char[] charArray = str.toCharArray() ;

            Arrays.sort(charArray) ;

            String sortedString = new String(charArray) ;

            if(!hashMap.containsKey(sortedString)){
                hashMap.put(sortedString , new ArrayList<>()) ;
            }

            hashMap.get(sortedString).add(str) ;

        }

        return new ArrayList<>(hashMap.values()) ;
    }

       public static void main(String [] args){
        System.out.println("4 Group Anagram.") ;

        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"}; 
        System.out.println("String array be: " + Arrays.toString(str)) ;

        List<List<String>> list = group_Anagram(str) ;

        System.out.println("Group Anagram be: " + list) ;




        
    }
    
}