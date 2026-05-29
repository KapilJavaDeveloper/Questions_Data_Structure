import java.util.HashSet ;
public class _9_Duplicate_Elements_In_Array{
    public static void main(String [] args){

        int[] arr = {1,2,3,2,4,5,6,1} ;

        HashSet<Integer> set = new HashSet<>() ;
        
        System.out.println("Duplicate Elements in an array be: ") ;

        for(int num: arr){

            if(!set.add(num)){
                System.out.print(num + " ") ;
            }
        }


    }
    
}