
import java.util.HashMap ;
public class _20_Check_Isomorphic_Strings{

    public static boolean is_Isomorphic(String s1 , String s2){

        if(s1.length() != s2.length()){
            return false ;  
        }

        HashMap<Character , Character> map1 = new HashMap<>() ;
        HashMap<Character, Character> map2 = new HashMap<>() ;

        for(int i=0 ; i<s1.length() ; i++){

            Character ch1 = s1.charAt(i) ;
            Character ch2 = s2.charAt(i) ;


            if(map1.containsKey(ch1)){

                if(map1.get(ch1) != ch2){
                    return false ;
                }

            }
            else{

                map1.put(ch1 , ch2) ;

            }


            if(map2.containsKey(ch2)){

                if(map2.get(ch2) != ch1){
                    return false ;
                }

            }
            else{

                map2.put(ch2,ch1) ;

            }

        }
        return true ;

    }

    public static void main(String [] args){

        String s1 = "paper" ;
        String s2 = "title" ;

        if(is_Isomorphic(s1,s2)){
            System.out.println("Isomorphic Strings ") ;
        }
        else{
            System.out.println("Not an Isomorphic Strings") ;

        }
  

    }
}