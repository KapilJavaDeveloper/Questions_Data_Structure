public class _8_Missing_Number_In_Array{
    public static void main(String [] args){

        int[] arr = {1,2,3,5,6} ;
        int n = 6 ;

        int expectedSum = n*(n+1)/2 ;
        int actualSum = 0;

        for(int m : arr){
            actualSum += m ;
        }


        int missing_Number = expectedSum - actualSum ;

        System.out.println("Missing Number in an array be: " + missing_Number) ;



    }
    
}