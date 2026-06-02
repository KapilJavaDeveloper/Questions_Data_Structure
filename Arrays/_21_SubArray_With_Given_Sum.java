import java.util.HashMap;
import java.util.Arrays ;
public class _21_SubArray_With_Given_Sum{

    static void subArray_With_Given_Sum(int[] arr , int target){

        int prefix = 0;

        HashMap<Integer , Integer> hashMap = new HashMap<>() ;

        for(int i=0; i<arr.length ; i++){

            prefix = prefix + arr[i] ;

            if(prefix==target){
                System.out.println("SubArray sum present from index 0 to "+ i) ;
                return ;
            }

            if(hashMap.containsKey(prefix-target)){
                System.out.println("SubArray sum present from index "+ (hashMap.get(prefix-target)+1) + " to " + i) ;
                return ;
            }

            hashMap.put(prefix ,i) ;

        }
        System.out.println("This "+ target + " subarray not present in an array") ;
    }

        public static void main(String[] args){

        System.out.println("Subarray with Given Sum") ;

           int[] arr = {10, 2, -2, -20, 10};
           int target = -10 ;
           System.out.println("Array be: "+ Arrays.toString(arr)) ;

           subArray_With_Given_Sum(arr,target ) ;

    }

}