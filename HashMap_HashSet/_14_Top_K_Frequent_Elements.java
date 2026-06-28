import java.util.Arrays ;
import java.util.HashMap ;
public class _14_Top_K_Frequent_Elements {

    public static void k_Frequent_Elements(int[] arr , int k){

        HashMap<Integer, Integer> hashMap = new HashMap<>() ;

        for(int nums : arr){
            hashMap.put(nums, hashMap.getOrDefault(nums, 0) + 1) ;

        }

        System.out.print("Most Frequent Elements be: ") ;
        for(int i=0; i<k ; i++){

            int element = -1 ;
            int maxFrequency = 0 ;

            for(Integer key : hashMap.keySet()){
                if(hashMap.get(key)> maxFrequency){
                    element = key ;
                    maxFrequency = hashMap.get(key) ;
                    System.out.print(element + " , ") ;
                    break ;
                }
            }

            hashMap.remove(element) ;

            


        }
    }
    public static void main(String [] args){
        System.out.println("14. Top K Frequent Elements.") ;

        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        System.out.println("Array be: " + Arrays.toString(nums)) ;

         k_Frequent_Elements(nums , k) ;

    }
    
}
