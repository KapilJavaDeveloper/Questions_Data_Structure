import java.util.Set ;
import java.util.HashSet ;
public class _14_Intersection_of_Array {

    static void intersection_Of_Two_Arrays(int[] arr1 , int[]arr2){

        Set<Integer> set = new HashSet<>() ;
        Set<Integer> intersection = new HashSet<>() ;

        for(int num: arr1){
            set.add(num) ;
        }

        for(int num: arr2){
            if(set.contains(num)){
                intersection.add(num) ;
            }
        }

        System.out.println("Intersection of Two Arrays be: ") ;

        for(int num : intersection){
            System.out.print(num + " ") ;
        }

    }
    public static void main(String [] args){
        System.out.println("Intersection of Arrays") ;

        int[] arr1 =  {1, 2, 2, 3, 4, 5};
        int[] arr2 = {2, 2, 3, 6, 7}; 

        intersection_Of_Two_Arrays(arr1, arr2);


    }
    
}
