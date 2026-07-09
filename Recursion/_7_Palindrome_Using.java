public class _7_Palindrome_Using {

    public static boolean pallindrome(String str , int start , int end ){
        if(start >= end){
            return true ;
        }

        if(str.charAt(start) != str.charAt(end)){
            return false ;
        }

        return pallindrome(str, start+1, end-1) ;

    }
    public static void main(String [] args){
        System.out.println("7. Program Pallindrome Using Recursion.") ;

        String str = "IaI"  ;
        System.out.println("String be: " + str) ;

        System.out.println(pallindrome(str, 0, str.length()-1)) ;
        if(pallindrome(str, 0, str.length()-1)){
            System.out.println("Pallindrome String.") ;

        }
        else{
            System.out.println("Not Pallindrome String.") ;
        }



    }
    
}
