public class _12_Merged_Two_Sorted_Arrays {

    static void merged_Two_Arrays(int[] arr1 , int[] arr2){
        int[] merged = new int[arr1.length+arr2.length] ;

        int n1 = arr1.length ;
        int n2 = arr2.length ;
        int i=0 ; 
        int j=0 ;
        int k=0 ;

        while(i<n1 && j<n2){
            if(arr1[i] >arr2[j]){
                merged[k] = arr2[j] ;
                j++ ;
                k++ ;
            }
            else{
                merged[k] = arr1[i] ;
                i++ ;
                k++ ;
            }
        }

        while(i<n1){
            merged[k] = arr1[i] ;
            i++ ;
            k++ ; 

        }
        while(j<n2){
            merged[k] = arr2[j] ;
            j++ ;
            k++ ;
        }

        for(int m=0; m<merged.length ; m++){
            System.out.print(merged[m] + " ") ;

        }

    }
    public static void main(String [] args){
        System.out.println("Merged Two Sorted Arrays") ;

        int[] arr1 =  {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8, 9, 10};

        merged_Two_Arrays(arr1, arr2) ;

    }
    
}
