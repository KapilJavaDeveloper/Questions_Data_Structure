public class _2_Fibonacci_Series{

    public static int fibonacci(int num){
        if(num == 0){
            return 0 ;
        }
        else if(num == 1){
            return 1 ;
        }
        return fibonacci(num-1) + fibonacci(num-2)  ;
    }
    public static void main(String [] args){
        System.out.println("2. Program for Fibonacci Series usinmg Recursion.") ;

        int num = 8 ;

        System.out.println("Fibonacci Series be: ") ;

        for(int i = 0; i<num ; i++ ){
            System.out.print(fibonacci(i)+  " ") ;
        }

    }
}