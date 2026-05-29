import java.util.HashMap ;
import java.util.Arrays ;
public class _10_To_Sum_Array{
    public static void main(String [] args){
        System.out.println("To Sum Array Program") ;

        int[] arr = {2, 7, 11, 15,1,1}; 
        System.out.println("Array be: " + Arrays.toString(arr)) ;
        int target = 9 ;
        System.out.println("Target value be: " + target) ;

        

        HashMap<Integer, Integer> hashmap = new HashMap<>() ;

        for(int i=0 ; i<arr.length ; i++){
            hashmap.put(arr[i], i) ;

            int complement = target - arr[i] ;

            if(hashmap.containsKey(complement)){
                System.out.println("Pair be: " + arr[i] + " and " + complement) ;
                return  ;
            }

        }

        



    }
    
}
