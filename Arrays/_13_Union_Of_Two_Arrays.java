import java.util.HashSet ;
public class _13_Union_Of_Two_Arrays {
    public static void main(String [] args){
        System.out.println("Union of Two Arrays") ;

        int[] arr1 = {1,2,3,4,5,6,7,8} ;
        int[] arr2 = {3,4,5,6,7,11,23} ;

        HashSet<Integer> hashSet = new HashSet<>() ;

        for(int i=0 ; i<arr1.length ; i++){
            hashSet.add(arr1[i]) ;
        }

        for(int i=0 ; i<arr2.length ; i++){
            hashSet.add(arr2[i]) ;
        }

        System.out.println("Union Array be: ") ;
        for(int num : hashSet){
            System.out.print(num + " ") ;
        }



    }
    
}
