import java.util.Arrays ;
import java.util.HashMap ;
public class _15_Subset {

    public static boolean check_For_Subset(int[] arr1 , int[] arr2){

        HashMap<Integer, Integer> hashMap = new HashMap<>() ;

        for(int nums : arr1){
            hashMap.put(nums , hashMap.getOrDefault(nums,0)+1) ;
        }

        for(int nums : arr2){

            if(!hashMap.containsKey(nums) || hashMap.get(nums)==0){
                return false ;
            }

            hashMap.put(nums , hashMap.get(nums)-1) ;
        }



        return true ;
    }
    public static void main(String [] args){
        System.out.println("15 Program for Checking a Subset Array.") ;

        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 2, 4};

        System.out.println("Array be: " + Arrays.toString(arr1)) ;
        System.out.println("Array be: "+ Arrays.toString(arr2)) ;

        if(check_For_Subset(arr1, arr2)){
            System.out.println("Subset") ;
        }
        else{
            System.out.println("Not Subset") ;
        }


    }
    
}
