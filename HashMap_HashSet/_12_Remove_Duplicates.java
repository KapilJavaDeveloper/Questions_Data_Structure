import java.util.Arrays ;
import java.util.HashSet ;
public class _12_Remove_Duplicates{

    public static void remove_Duplicate_Elements(int[] arr){

        HashSet<Integer> hashSet = new HashSet<>()  ;

        for(int num : arr){
            hashSet.add(num) ;
        }

        System.out.println("Array after Removing Duplicate Elements be: ") ;

        for(Integer num : hashSet){
            System.out.print(num + " ") ;
        }


    }
    public static void main(String [] args){
        System.out.println("12. Program to Remove Duplicates Elements from array.") ;

         int[] arr = {1, 2, 3, 2, 4, 5, 1, 6};
         System.out.println("Array be: " + Arrays.toString(arr)) ;

         remove_Duplicate_Elements(arr) ;


    }
}