public class _10_String_Rotation {

    public static boolean is_Rotated_String(String str1 , String str2){

        if(str1.length()!=str2.length()){
            return false ;
        }

        String temp = str1 + str1  ;

        if(temp.contains(str2)){
            return true ;
        }

        return false ;


    }
    public static void main(String [] args){
        System.out.println("String Rotation Program") ;

        String str1 = "ABCD" ;
        String str2 = "CDAB"  ;

        System.out.println("First String be: " + str1) ;
        System.out.println("Second String be: " + str2) ;

        if(is_Rotated_String(str1 , str2)){
           System.out.println("Rotated Strngs") ;

        }
        else{
            System.out.println("Not Rotated Strings") ;

        }


    }
    
}
