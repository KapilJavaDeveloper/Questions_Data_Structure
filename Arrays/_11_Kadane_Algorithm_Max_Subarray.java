public class _11_Kadane_Algorithm_Max_Subarray{

    static int maximum_SubArray_Sum(int[] arr){
        int currentMax = arr[0] ;
        int maxSoFar = arr[0]  ;
        int start = 0 ;
        int end = 0 ;
        int temp = 0 ;

        for(int i=1 ; i<arr.length ; i++){
            if(arr[i] > currentMax+arr[i]){
                currentMax = arr[i] ;
                temp = i ;

            }
            else{
                currentMax = currentMax + arr[i] ;
            }

            if(maxSoFar<currentMax){

                start = temp ;
                end = i ;
                maxSoFar = currentMax ;

            }
            // currentMax = Math.max(arr[i] , currentMax+arr[i]) ;
            // maxSoFar = Math.max(maxSoFar , currentMax)  ;
        }
        System.out.println("Elements of Maximum sum Subarray be: ") ;
        for(int i=start ; i<=end ; i++){
            System.out.print(arr[i] + " ") ;
        }
        return maxSoFar ;
    }
    public static void main(String [] args){
        System.out.println("Maximum Subarray Sum") ;
    

    int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4} ; 

    int max = maximum_SubArray_Sum(arr) ;
    System.out.println() ;

    System.out.println("Maximum Subarray Sum be: " + max) ;

    }

}