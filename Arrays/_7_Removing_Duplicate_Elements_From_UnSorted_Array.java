import java.util.Arrays ;
public class _7_Removing_Duplicate_Elements_From_UnSorted_Array {

    static int remove_Duplicates_Elements_From_UnSorted_Array(int[] arr){
        if(arr.length==0){
            return 0 ;
        }
        else if(arr.length==1){
            return 1 ;
        }

        int[] temp = new int[arr.length]  ;
        int k = 0 ;

        for(int i=0 ; i<arr.length ; i++){

            boolean duplicate = false ;

            for(int j=0 ; j<k ; j++){
                if(arr[i] ==arr[j]){
                    duplicate = true ;
                    break ;
                }
            }

            if(!duplicate){
                    temp[k] = arr[i] ;
                    k++ ;
            }
        }


        for(int i=0 ; i<temp.length ; i++){
            arr[i] = temp[i] ;
        }

        return k;
    }



    public static void main(String [] args){
        System.out.println("Removing duplicate elements from Unsorted Array") ;

        int[] arr = {4, 2, 1, 2, 3, 4, 5, 3} ; 
        System.out.println("Array be: ") ;
        System.out.println(Arrays.toString(arr)) ;

        int length = remove_Duplicates_Elements_From_UnSorted_Array(arr) ;

        System.out.println("Array after removing duplicates elements be: ") ;

        for(int i=0 ; i<length ; i++){
            System.out.print(arr[i] + " ") ;
        }
        

    }
    
}
