public class _1LargestElement{
    public static void main(String [] args){
   

        int[] arr = new int[] {23,12,45,23,9,45, 4} ;

        int largest = arr[0]  ;

        for(int i=0 ; i<arr.length ; i++){

            if(arr[i] > largest){
                largest = arr[i] ;
            }

        }

        System.out.println("Largest Element in an Array be: " + largest) ;
    }
}