import java.util.Arrays ;
import java.util.HashMap ;
public class _16_Count_Pairs {

    public static void count_Pairs(int[] arr , int target){

        HashMap<Integer , Integer> hashMap = new HashMap<>()  ;

        // hashMap.put(arr[0] ,hashMap.getOrDefault(arr[0], 0) + 1 ) ;
        int count = 0  ;

        for(int num : arr){

            int complement = target - num ;

            if(hashMap.getOrDefault(complement , 0) > 0){

                int freq = hashMap.get(complement) ;

                for(int i=0 ; i<freq ; i++){
                    System.out.print("(" + complement + "," + num + ")") ;
                    count++ ;
                }

            }

            hashMap.put(num , hashMap.getOrDefault(num , 0) + 1) ;
        }
        System.out.println() ;
        System.out.println(count + " pairs of "+ target + " value") ;
    }
    public static void main(String [] args){
        System.out.println("16. Program to display Pairs.") ;

       
        int[] arr = {3,3};
        int target = 6;

        count_Pairs(arr , target) ;
    }
    
}