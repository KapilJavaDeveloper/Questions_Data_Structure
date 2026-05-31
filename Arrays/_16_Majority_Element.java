public class _16_Majority_Element{

    static int majority_Element(int[] arr){
        int majorityElement = arr[0] ;
        int count = 1 ;

        for(int num : arr){
            if(count==0){
                majorityElement = num ;
                count = 1 ;
            }
            else if(num == majorityElement){
                count++ ;

            }
            else{
                count-- ;
            }
        }

        if(count > arr.length/2){
            return majorityElement ;
        }
        else{
            return -1 ;
        }

    
    }
    public static void main(String [] args){
        System.out.println("Majority Element ") ;

        int[] arr = {2, 2, 1, 1, 2, 2, 2};

        int num = majority_Element(arr) ;

        if(num == -1){
            System.out.println("There is no majority element in an array") ;
        }
        else{
            System.out.println("Majority Element in an array be: " + num) ;
        }


    }
}