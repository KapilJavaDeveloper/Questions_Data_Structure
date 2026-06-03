// package Strings;

public class _3_Count_Vowels_In_String {
    public static void main(String [] args){
        System.out.println("Vowels in String") ;

        String str = "Hello World"; 

        int count =0 ;

        for(int i=0; i<str.length() ; i++){

            if(str.charAt(i)=='a' ||
            str.charAt(i)=='e' ||
            str.charAt(i)=='i' ||
            str.charAt(i)=='o' ||
            str.charAt(i)=='u'){
                count++ ;
            }
            
        }
        System.out.println("Number of vowels in "+ str + " be: " + count) ;
    }
    
}
