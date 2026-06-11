public class _19_String_Permutations{

    public static void permutation_Of_String(String input , String result){
        if(input.length()==0){
            System.out.println(result ) ;
            return ;
        }

        for(int i=0 ; i<input.length() ; i++){
            char character = input.charAt(i) ;

            String remaining = input.substring(0,i) + input.substring(i+1) ;

            permutation_Of_String(remaining, result + character);

        }
    }
    public static void main(String [] args){
        System.out.println("String Permutations Program") ;

        String input = "ABC" ;

        System.out.println("All permutation of String "+ input + " be: ") ;
        permutation_Of_String(input, "");


    }
}