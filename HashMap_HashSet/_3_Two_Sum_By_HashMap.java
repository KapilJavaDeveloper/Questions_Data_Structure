import java.util.Map ;
import java.util.HashMap ;
import java.util.Arrays ;
public class _3_Two_Sum_By_HashMap{

    public static int[] two_Sum(int[] arr , int target){

        Map<Integer , Integer> map = new HashMap<>() ;

        for(int i=0 ; i<arr.length ; i++){
            int complement = target - arr[i] ;
            if(map.containsKey(complement)){
                return new int [] { map.get(complement),i} ;               
            }
            map.put(arr[i],i) ;
        }

        return new int[] {-1, -1} ;


    }
    public static void main(String [] args){
        System.out.println("3 Program for Two Sum By HashMap.") ;

        int[] arr = {2, 7, 11, 15}; 
        int target = 9 ;


        System.out.println("Array be: " + Arrays.toString(arr) ) ;

        int[] result = two_Sum(arr, target) ;

        System.out.println("Indices of "+ target +" in an array be: " + result[0] + " and " + result[1]) ;

    }
}