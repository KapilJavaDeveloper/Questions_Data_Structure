import java.util.Arrays ;
import java.util.HashSet ;
public class _6_Common_Elements_In_Array {

    public static void common_Elements_Between_Two_Arrays(int[] arr1 , int[] arr2){

        HashSet<Integer> set1 = new HashSet<>() ;
        HashSet<Integer> set2 = new HashSet<>()  ;

        for(int num : arr1){
            set1.add(num) ;
        }

        System.out.println("Common Elements Between Two Arrays are ") ;
        for(int num : arr2){

            if(set1.contains(num) && !set2.contains(num)){
                  System.out.print(num + " ")  ;
                  set2.add(num) ;
            }
           
        }

       


    }
    public static void main(String [] args){

        System.out.println("6 Program To print common elements between Two Arrays.") ; 
        
        int[] arr1 = {1,2,3,4,5,6,7,8,8} ;
        int [] arr2 = {3,4,8,9,3,12} ;

        System.out.println("Arrays be: " + Arrays.toString(arr1)) ;
        System.out.println("Array be: "+ Arrays.toString(arr2)) ;

        common_Elements_Between_Two_Arrays(arr1, arr2) ;

    
    }
    
}
