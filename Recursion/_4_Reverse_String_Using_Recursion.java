public class _4_Reverse_String_Using_Recursion {
    public static String reverse_String(String str, String reverse){
        if(str == ""){
            return reverse ;
        }

        return reverse_String( str.substring(0, str.length() -1) , reverse + str.charAt(str.length()-1) )  ;

    }
    public static void main(String [] args){
        System.out.println("4. Reverse String Using Recursion.") ;

        String str = "Isskander"  ;


        System.out.println(str.substring(0,str.length() -1) ) ;

        System.out.println(reverse_String(str, "")) ;
        
    }
    
}
