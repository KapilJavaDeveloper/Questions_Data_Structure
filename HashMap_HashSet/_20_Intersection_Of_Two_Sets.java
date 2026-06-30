import java.util.HashSet ;
public class _20_Intersection_Of_Two_Sets {
    public static void main(String [] args){

        System.out.println("20. Intersection Of Two Programs.")  ; 

        HashSet<Integer> set1 = new HashSet<>()  ;
        HashSet<Integer> set2 = new HashSet<>()  ;

        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);

        set2.add(30);
        set2.add(40);
        set2.add(50);
        set2.add(60);

        System.out.println("Set 1 be: " + set1) ;
        System.out.println("Set 2 be: " + set1) ;

        HashSet<Integer> intersection = new HashSet<>(set1)  ;

        intersection.retainAll(set2) ;

        System.out.println("Intersection between set1 and set2 be: " + intersection) ;


    }
    
}
