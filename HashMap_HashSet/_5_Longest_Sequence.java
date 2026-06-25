import java.util.Arrays ;
import java.util.HashSet ;

public class _5_Longest_Sequence {

    public static int longest_Sequence(int [] arr){
        if(arr.length==0 || arr==null){
            return 0 ;
        }

        HashSet<Integer> set = new HashSet<>() ;

        for(int num : arr){
            set.add(num) ;
        }

        int maxLength = 0 ;
        for(Integer num : set){


            if(!set.contains(num-1)){
                int currentValue = num ;

                int length = 1; 

                while(set.contains(currentValue+1)){
                    currentValue++ ;
                    length++ ;
                }

                maxLength = Math.max(maxLength , length) ;
            }
        }

        return maxLength ;


    }
    public static void main(String [] args){
        int[] arr = {100, 4, 200, 1, 3, 2};

        System.out.print("Array be: ") ;
        System.out.println(Arrays.toString(arr)) ;

        System.out.println("Longest Sequence in array be: " + longest_Sequence(arr)) ;


    }
    
}