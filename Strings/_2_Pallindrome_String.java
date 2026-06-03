// package Strings;

public class _2_Pallindrome_String {

    static void check_Pallindrome(String str){
        boolean pallindrome = true ;


        for(int i=0 ; i<str.length()/2 ; i++){

            if(str.charAt(i) !=str.charAt(str.length() -1 - i)){
                pallindrome = false ;
                break ;
            }

        }

        if(pallindrome== false){
            System.out.println(str + " is not an Pallindrome") ;
        }
        else{
            System.out.println(str + " is a Pallindrome") ;
        }
    }
    public static void main(String [] args){
        System.out.println("Pallindrome Program") ;

        String str = "madam" ;
        check_Pallindrome(str) ;
    }
    
}