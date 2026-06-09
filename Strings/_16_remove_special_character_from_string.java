public class _16_remove_special_character_from_string {
    public static void main(String [] args){

        String str = "Java@123#Program!";

        String result = str.replaceAll("[^a-zA-Z0-9]", "") ;

        System.out.println("String be: "+ str) ;
        System.out.println("String after removing all special characters: "+ result) ; 



    }
    
}
