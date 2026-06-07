public class _11_Compress_String{

    public static String compress(String input){

        if(input==null || input.length()==0){
            return ""  ;
        }

        StringBuilder s = new StringBuilder() ;

        int count = 1 ;

        for(int i=1 ; i<=input.length() ; i++){

            if(i<input.length() && input.charAt(i)==input.charAt(i-1)){
                count++ ;
            }
            else{
                s.append(input.charAt(i-1)) ;
                s.append(count) ;
                count = 1 ;
            }

        }

        return s.toString() ;

    }

    
        public static void main(String [] args){
        System.out.println("Compresed String program") ;

        String input = "aaabbccccdd";
        String result = compress(input);

        System.out.println("Original String be: "+ input) ;
        System.out.println("Compressed String be: "+ result) ;


    }


}