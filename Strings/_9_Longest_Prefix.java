public class _9_Longest_Prefix {

    public static String find_Longest_Prefix(String[] arr){

        if(arr.length==0 || arr[0]==""){
            return "" ;
        }

        String prefix = arr[0]  ;

        for(int i=1 ; i<arr.length ; i++){
            while(arr[i].indexOf(prefix) !=0){
                prefix = prefix.substring(0, prefix.length()-1) ;

                if(prefix.isEmpty()){
                    return "" ;

                }
            }
        }

        return prefix ;


    }
    public static void main(String [] args){

        String[] str = {"flower" , "flow" , "flight"} ;

        System.out.println("array of String be: ") ;

        for(int i=0 ; i<str.length ; i++){
            System.out.print(str[i] + " ") ;

        }
        System.out.println() ;

        System.out.println("Longest prefix in an Array of Strings be: " + find_Longest_Prefix(str) ) ;

    }
    
}
