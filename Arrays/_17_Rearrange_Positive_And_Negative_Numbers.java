import java.util.Arrays ;
public class _17_Rearrange_Positive_And_Negative_Numbers {

    static int[] rearrange_Positive_and_Negative_Numbers(int[] arr){

        int[] positiveArray = new int[arr.length]   ;
        int[] negativeArray = new int[arr.length]   ;
        int positiveCount = 0 ;
        int negativeCount = 0 ;

        for(int num: arr){
            if(num >=0){
                positiveArray[positiveCount] = num ;
                positiveCount++ ;
            }
            else{
                negativeArray[negativeCount] = num ;
                negativeCount++ ;
            }
        }

        int i=0, j=0,k=0 ;

        while(i<positiveCount && j<negativeCount){
            arr[k] = positiveArray[i] ;
            i++ ;
            k++ ;
            arr[k] = negativeArray[j] ;
            j++ ;
            k++ ;

        }

        while(i<positiveCount){
            arr[k] = positiveArray[i] ;
            i++ ;
            k++ ;
        }

        while(j<negativeCount){
            arr[k] = negativeArray[j] ;
            j++ ;
            k++ ;
        }
       

        return arr ;
    }
    public static void main(String [] args){
        System.out.println("Rearrange Positive and Negative Numbers") ;

        int[] arr = {1, -2, 3, -4, -1, 4, 6, -7, 8}; 
        System.out.println("Original Array be: ") ;
        System.out.println(Arrays.toString(arr)) ;

       int[] arrangedArray = rearrange_Positive_and_Negative_Numbers(arr)   ;
       System.out.println("Rearranged Array be: ") ;


        System.out.println(Arrays.toString(arrangedArray)) ;



    }
    
}
