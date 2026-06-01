import java.util.Arrays ;
public class _19_Prefix_Array{

    static void prefix_Array(int[] arr){
        int sum = arr[0] ;
        for(int i=1; i<arr.length ; i++){
            sum = sum + arr[i] ;
            arr[i] = sum  ;
        }
    }
    public static void main(String [] args){
        System.out.println("Prefix Array Program") ;

        int[] arr = {2, 4, 6, 8, 10};    
        System.out.println("Array be: ") ;
        System.out.println(Arrays.toString(arr)) ;
        prefix_Array(arr) ;
        System.out.println("Prefix Array be: ") ;
        System.out.println(Arrays.toString(arr)) ;
        
    }
}