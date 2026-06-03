public class _1_Reverse_A_String {

    public static void main(String [] args){

        String str = "Isskander"  ;
        String reversed = "" ;

        for(int i=str.length()-1 ; i>=0 ;i-- ){
            reversed = reversed + str.charAt(i) ;
        }
        System.out.println("String be: " + str) ;
        System.out.println("Reversed String be: " + reversed) ;

    }
    
}
