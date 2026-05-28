import java.util.Arrays;

public class _6_Removing_Duplicates_Elements_From_Sorted_Array {

    static int remove_Duplicates_Elements_From_UnSorted_Array(int[] arr){
        if(arr.length ==0){
            return 0 ;
        }

        int index = 0 ;

        for(int i=1 ; i<arr.length ; i++){
            if(arr[i] !=arr[index]){
                index++ ;
                arr[index] = arr[i] ;
            }
        }

        return index+1 ;

    }

      
    public static void main(String [] args){

        int[] arr = {1,2,2,3,4,5,6,7,7,8,8,8}  ;
        System.out.println("Array be: " + Arrays.toString(arr)) ;
        
        int length = remove_Duplicates_Elements_From_UnSorted_Array(arr) ;
        
        System.out.println("Array after removing Duplicates elements be: ") ;
        
        for(int i=0 ; i<length ; i++){
            System.out.print(arr[i] + " ") ;
        }
        

    }
    
}
