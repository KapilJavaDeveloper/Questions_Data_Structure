public class _4_Rotate_Array_By_K {

    static int[] rotateArray(int[] arr , int k){

         k = k % arr.length ;

         int[] temp = new int[arr.length] ;
        
         

         for(int i=0;i<k ; i++){
            temp[i] = arr[arr.length-k+i] ;
         }
         
         for(int i=0 ; i<arr.length-k ; i++){
            temp[k+i] = arr[i]  ;
            
         }
        
         return temp ;
        
    }
    public static void main(String [] args){
    

        int[] arr = {1,2,3,4,5,6}  ;
        int k =  2 ;


        System.out.println("Original Array be: ") ;
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ") ;
        }

        int[] temp = rotateArray(arr , k) ;

        System.out.println() ;

        System.out.println("Rotated array by " + k  + " position be: ") ;

        for(int i=0 ; i<temp.length ; i++){
            System.out.print(temp[i] + " ");
        }


    }
    
}
