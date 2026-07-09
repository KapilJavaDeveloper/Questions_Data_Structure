public class _3_Sum_Of_Digits_Using_Recursion{

    public static int sum_Of_Digits(int num){
        if(num==0){
            return 0 ;
        }

        return (num%10) + sum_Of_Digits(num/10)  ;
    }
    public static void main(String [] args){
        System.out.println("3. Program to Sum of Digits Using Recursion.") ;

        int num = -67 ;

        int num1 = Math.abs(num) ;

        System.out.println("Sum of Digits of "+ num1 + " be: "+ sum_Of_Digits(num1)) ;

    }
}