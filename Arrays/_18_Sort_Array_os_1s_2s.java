import java.util.Arrays ;
public class _18_Sort_Array_os_1s_2s {

    static void sort_Arrays_0s_1s_2s(int[] arr){
        int start =0, mid =0 , last =arr.length-1 ;

        while(mid<=last){

            switch(arr[mid]){
                case 0:
                    int temp =arr[start];
                    arr[start] = arr[mid] ;
                    arr[mid] = temp ;
                    start++ ;
                    mid++ ;
                    break ;

                case 1:
                    mid++ ;
                    break ;

                case 2:
                    temp =arr[last] ;
                    arr[last] = arr[mid] ;
                    arr[mid] = temp ;
                    last-- ;
                    break ;


            }

        }


    }
    public static void main(String [] args){
        System.out.println("Sort the os  ,1s ,2s array") ;

        int[] arr = {0, 1, 2, 0, 1, 2, 1, 0, 2, 1}; 
        System.out.println("Original Array be: ") ;
        System.out.println(Arrays.toString(arr)) ;

        sort_Arrays_0s_1s_2s(arr) ;
        System.out.println("Sorted Array be: ") ;
        System.out.println(Arrays.toString(arr)) ;

    }
    
}
