import java.util.HashSet ;
public class _6_Remove_Duplicates_Characters {
    public static void main(String [] args){
        System.out.println("Removing Duplicates Elements from String Program ->") ;

        String str = "programming" ;
        System.out.println("Original String be: " + str) ;

        StringBuilder result = new StringBuilder() ; 

        HashSet<Character> set = new HashSet<>() ;

        for(char c: str.toCharArray()){

            if(!set.contains(c)){
                set.add(c) ;
                result.append(c) ;

            }

        }

        System.out.println("String after duplicate characters be: "+ result) ;
      

    }
    
}