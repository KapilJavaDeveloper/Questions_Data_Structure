// package HashMap_HashSet;

import java.util.Arrays ;
import java.util.HashSet ;
public class _2_First_Repeated_Element {

    
    public static void main(String [] args){
        System.out.println("2 Program to Find First Repeated Element in an array") ;

        int[] arr = {10, 5, 3, 4, 3, 5, 6};

        System.out.println("Array be: " + Arrays.toString(arr)) ;

        HashSet<Integer> hashSet = new HashSet<>()  ;

        for(int num : arr){
            if(hashSet.contains(num)){
                System.out.println("First Repeated Element be: " + num) ;
                break ;
            }
            hashSet.add(num) ;
        }



    }
}    
    