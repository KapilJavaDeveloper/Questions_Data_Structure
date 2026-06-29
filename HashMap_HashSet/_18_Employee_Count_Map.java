import java.util.Arrays ;
import java.util.HashMap ;
public class _18_Employee_Count_Map {
    public static void main(String [] args){

        System.out.println("18. Program to Count the Employee") ; 


        String[] employees = {
                "John", "Alice", "Bob",
                "John", "Alice", "John",
                "David", "Bob"
        };

        System.out.println("Employees are : " + Arrays.toString(employees)) ;

        HashMap<String , Integer> hashMap = new HashMap<>() ;

        for(String str : employees){
            hashMap.put(str, hashMap.getOrDefault(str , 0)+1) ;
        }

        System.out.println("Employees Counting are -----> ") ;

        for(String key: hashMap.keySet()){
            System.out.println(key + " -> " + hashMap.get(key)) ;
        }


    }
    
}
