public class _5_remove_Word {
    public static void main(String [] args){
        String str = "Java is a powerful programming language";
        System.out.println("Original string be: " + str) ;
        
        String wordToRemove = "powerful";

        str = str.replace(wordToRemove , "").replaceAll("\\s+", " ").trim() ;
        System.out.println("String after removing word "+ wordToRemove + " be: " + str) ;
    }
    
}
