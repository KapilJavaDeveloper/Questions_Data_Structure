public class _2_Second_Largest_Element_In_Array{
    public static void main(String [] args){
        int[] arr =  {12, 35, 1, 10, 34, 1} ;

        int largest = Integer.MIN_VALUE ;
        int second_largest = Integer.MAX_VALUE ;

        for(int i=0 ; i<arr.length ; i++){

            if(arr[i] >largest){
                second_largest = largest ;
                largest = arr[i] ;
            }
            else if(arr[i]>second_largest && arr[i] != largest){
                second_largest = arr[i]   ;
            }
        }

        if(second_largest == Integer.MIN_VALUE){
            System.out.println("No second largest element present in an array") ;
        }
        else{
            System.out.println("Second largest element be: "+ second_largest) ;
        }


    }
}