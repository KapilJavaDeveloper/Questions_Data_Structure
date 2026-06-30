import java.util.Arrays ;
import java.util.HashMap ;
public class _19_Word_Frequency_In_String{
    public static void main(String [] args){

        String text = "Java is easy Java is powerful Java";

        System.out.println("String be: " + text) ;

        String[] words = text.toLowerCase().split("\\s+") ;

        System.out.println("String converted into Array that be: "+ Arrays.toString(words)) ;

        HashMap<String , Integer> hashMap = new HashMap<>() ;

        for(String str : words){
            hashMap.put(str , hashMap.getOrDefault(str , 0)+1) ;
        }

        System.out.println("Frequency of words in String are --> ") ;

        for(String key: hashMap.keySet()){
            System.out.println(key + " - " +  hashMap.get(key)) ;
        }


    }
}