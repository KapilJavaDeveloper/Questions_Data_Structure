import java.util.HashMap ;
import java.util.Arrays ;
public class _13_Subarray_Equals_K{

    public static int number_subarray(int[] arr, int target){

        HashMap<Integer , Integer>  hashMap = new HashMap<>() ;
        hashMap.put(0, 1) ;
        int prefix = 0 ;
        int count = 0; 

        for(int nums: arr){

            prefix = prefix + nums ;

            if(hashMap.containsKey(prefix-target)){
                count = count + hashMap.get(prefix-target) ;
            }

            hashMap.put(prefix , hashMap.getOrDefault(nums,0)+ 1) ;

        }
        return count ;
    }
    public static void main(String [] args){
        System.out.println("13. Program for Subarray sum equals k") ;

        int[] nums = {1, 2, 3, -1, 2};
        int k = 3;

        System.out.println("Array be: "+ Arrays.toString(nums)) ;

        System.out.println("Number of SubArrays of sum " + k + " be : " + number_subarray(nums , k) ) ;

    }
}