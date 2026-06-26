import java.util.Arrays ;
import java.util.HashSet ;
public class _8_Count_Distinct_Elements {

    public static void number_Of_Distinct_Elements(int[] arr){

       HashSet<Integer> hasSet = new HashSet<>() ;

       for(int num : arr){
        if(hasSet.add(num)){
            System.out.print(num + " ") ;
        }
       }
        
    }
    public static void main(String [] args){

        System.out.println("8. Program to Count Distinct Elements.") ;

        int[] arr = {10, 20, 30, 20, 40, 10, 50};
        System.out.println("Array be: " + Arrays.toString(arr))  ;


        System.out.print("Distinct Elements in Array be: ") ;
        number_Of_Distinct_Elements(arr) ;




    }
    
}
