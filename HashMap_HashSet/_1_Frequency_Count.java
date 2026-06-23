// package HashMap_HashSet;

import java.util.HashMap ;
import java.util.Arrays ;
public class _1_Frequency_Count {
    public static void main(String [] args){
        System.out.println("1 Program to count Frequency") ;
        int[] arr = {1, 2, 3, 2, 1, 4, 2, 3, 1}; 

        System.out.println("Array be: " + Arrays.toString(arr)) ;

        HashMap<Integer , Integer> hashMap = new HashMap<>() ;

        for(int num : arr){
            hashMap.put(num , hashMap.getOrDefault(num , 0)+ 1) ;
        }

        System.out.println("Arrays Elements Frequencies: ") ;

        for(Integer key : hashMap.keySet()){
            System.out.println(key + " -> " + hashMap.get(key)) ;
        }

      

    }
    
}