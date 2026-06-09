public class _15_Count_Of_Substring_Occurrence{
    public static void main(String [] args){


        String str = "Java is easy. Java is powerful. Java is popular.";
        String sub = "Java";

        int count = 0;
        int index = 0 ;

        while((index =str.indexOf(sub,index)) != -1){
            count++ ;
            index = index + sub.length() ;
        }

        System.out.println("Maximum occurence of String "+ sub + " in String "+ str + " be: "+ count) ;



    }
}