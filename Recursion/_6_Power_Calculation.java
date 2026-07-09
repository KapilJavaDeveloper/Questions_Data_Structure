public class _6_Power_Calculation {
    public static int power_Calculation(int base , int exponent){
        if(exponent == 0){
            return 1 ;
        }

        return base*power_Calculation(base, exponent-1) ;
    }
    public static void main(String [] args){

        System.out.println("6. Program for Power Calculation Using Recursion.") ;

        int base = 3 ;
        int exponent = 2 ;

        System.out.println(base+ "^" +exponent + " be: " + power_Calculation(base, exponent)) ;
    }
    
}
