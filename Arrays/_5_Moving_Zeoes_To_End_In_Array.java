import java.util.Arrays ;
public class _5_Moving_Zeoes_To_End_In_Array {
    public static void main(String [] args){
   
        int[] arr= {1 , 0, 2, 0, 3, 4, 5, 0 , 6}  ;

        System.out.println("Array be: " + Arrays.toString(arr)) ;


        int index = 0 ;

        for(int i=0 ;i<arr.length ; i++){

            if(arr[i] !=0){
                arr[index] = arr[i] ;
                index++ ;
            }

        }

        while(index<arr.length){
            arr[index] = 0;
            index++ ;
        }

        System.out.println("Array after moving zeroes to end of array be: "+ Arrays.toString(arr));
         
    }
    
}
