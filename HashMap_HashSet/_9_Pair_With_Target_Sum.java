import java.util.Arrays ;
import java.util.HashSet ;
public class _9_Pair_With_Target_Sum{

    public static int[] pair_Sum(int[] arr , int target){

        HashSet<Integer> hashSet = new HashSet<>() ;

        for(int num : arr){
            hashSet.add(num) ;

            if(hashSet.contains(target-num)){
                return new int[] {num , target-num} ;  
            }
        }
        return new int[] {-1, -1} ;
    }
    public static void main(String [] args){
        System.out.println("9. Program With Target Sum") ;

        int[] arr = {2, 7, 11, 15, 3, 6}; 
        int target = 9 ;
        System.out.println("Array be: " + Arrays.toString(arr)) ;

        int[] arr1 =  pair_Sum(arr, target) ;

        
        if(arr1[0] != -1 && arr1[1] != -1){
            System.out.println("Pair of sum of "+ target + " be: " + arr1[0] + " and " + arr1[1]) ;
        }
        else{
            System.out.println("Pair Not Found") ;
        }

    }
}