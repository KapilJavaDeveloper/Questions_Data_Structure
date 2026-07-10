public class _10_Permutation_Using_Recursion{
    public static int permutation(int num){
        if(num == 0 || num == 1){
            return 1 ;
        }

        return num*permutation(num-1)  ;
    }
    public static void main(String [] args){

        System.out.println("10. Permutation Program Using Recursion.") ;

        int num = 5 ;

        System.out.println("Permutation of "+num + " be: " + permutation(num)) ;

    }
}