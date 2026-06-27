import java.util.Arrays ;
import java.util.HashMap ;
public class _11_Majority_Element {

    public static void majority_Element(int[] arr){
        HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>() ;

        for(int num : arr){
            hashMap.put(num , hashMap.getOrDefault(num , 0) + 1) ;
        }
        int n = arr.length ;
        boolean found = false  ;

        for(Integer key : hashMap.keySet()){
            if(hashMap.get(key) > n/2){
                found = true ;
                System.out.println("Majority Element in an array be: " + key) ;
                break ;
            }
        }

        if(!found){
            System.out.println("No Majority Element in an Array") ;
        }

    }
    public static void main(String [] args){
        System.out.println("11. Program majority Element in an array.") ;

        int[] arr = {2, 2, 1, 2, 3, 2, 2};

        System.out.println("Array be: " + Arrays.toString(arr) ) ;

        majority_Element(arr) ;
    }
    
}
