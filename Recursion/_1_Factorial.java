public class _1_Factorial {

    public static int factorial(int num){
        if(num <1){
            return -1 ;
        }
        if(num==1){
            return 1 ;

        }
        factorial(num -1) ;
        return  num*factorial(num-1) ;

    }
    public static void main(String [] args){
        System.out.println("1 Program for Factorial with recursion") ;
        int num =  6 ;

        int factorial = factorial(num) ;
        
        if(factorial == -1){
            System.out.println("Cannot Have Factorial for Negative number.") ;

        }
        else{
            System.out.println("Factorial of " + num + " be: " + factorial ) ;
        }

    }
    
}
