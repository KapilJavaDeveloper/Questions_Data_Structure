import java.util.Arrays ;
import java.util.List ;
import java.util.ArrayList ;
public class _9_Subsets_Using_Recursion {

    public static void subSets(int[] arr , int index , List<Integer> current){
        if(index == arr.length){
            System.out.println(current) ;
            return ;
        }

        subSets(arr, index+1, current);

        current.add(arr[index]) ;

        subSets(arr, index+1, current);

        current.remove(current.size()-1) ;

    }
    public static void main(String [] args){
        System.out.println("9. Program Subsets Using Recursion.") ;
        int[] arr = {1, 2, 3};

        System.out.println("Array be: " + Arrays.toString(arr)) ;

        subSets(arr, 0, new ArrayList<Integer>());

    }
    
}
