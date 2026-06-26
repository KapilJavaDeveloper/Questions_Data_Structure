import java.util.Arrays ;
import java.util.HashSet ;
public class _7_Find_Duplicates {

    public static void printing_Duplicates(int[] arr){

        HashSet<Integer> hashSet = new HashSet<>() ;

        for(int num: arr){

            if(hashSet.contains(num)){
                System.out.print(num + " ") ;
            }

            hashSet.add(num) ;

        }
        

    }
    public static void main(String [] args){
        System.out.println("7. Program Find Duplicates ") ;

         int[] arr = {10, 20, 30, 20, 40, 10, 50};

         System.out.println("Array be: " + Arrays.toString(arr)) ;

         System.out.println("Duplicates Elements in an Array be: " ) ;
         printing_Duplicates(arr);

    }
    
}