import java.util.Arrays ;
public class _20_Product_Except_Self{

    static void product_Itself(int[] arr){
        int[] result = new int[arr.length] ;
        result[0]=1 ;


        // left product
        for(int i=1 ;i<arr.length ;i++){
            result[i] = result[i-1]*arr[i-1] ;
        }

        // right product 
        int rightProduct = 1 ;

        for(int i=arr.length-1 ; i>=0 ; i--){
            result[i] = result[i] * rightProduct ;

            rightProduct = rightProduct*arr[i] ;

        }

        System.out.println("Product Array except self be: ") ;
        System.out.println(Arrays.toString(result)) ;

    }
    public static void main(String [] args){
        System.out.println("Product Itself ") ;

        int[] arr = {1,2,3,4}  ;
        System.out.println("Original Array be: ") ;
        System.out.println(Arrays.toString(arr)) ;

        product_Itself(arr) ;
    }
}
C:\Users\welcome\Desktop\Question_Data_Structure\Arrays\_20_Product_Except_Self.java