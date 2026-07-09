import java.util.Arrays ;
public class _5_Binary_Search {

    public static int binary_Search(int[] arr , int low , int high, int key){
        if(low > high){
            return -1 ;
        }

        int mid = low + (high-low)/2 ;


        if(key < arr[mid]){
            high = mid-1 ;
            return binary_Search(arr, low, high, key) ;

        }
        else if (key>arr[mid]){
            low = mid+1 ;
            return binary_Search(arr, low, high, key) ;

        }
        else{
            return mid ;
        }
    }
    public static void main(String [] args){
        System.out.println("5. Program for Binary Search Using Recursion.") ;

        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int key = 60;

        System.out.println("Array be: " + Arrays.toString(arr)) ;
        System.out.println("Searched Element be: " + key) ;

        System.out.println(binary_Search(arr, 0, arr.length -1 , key)) ;

        if(binary_Search(arr, 0, arr.length -1 , key) == -1){
            System.out.println("Element " + key + " not found in array.") ;
        }
        else{
            System.out.println("Element found at index " + binary_Search(arr, 0, arr.length -1 , key) + " in array.") ;
        }


    }
    
}
