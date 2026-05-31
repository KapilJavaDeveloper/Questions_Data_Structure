public class _15_Stock_Buy_And_Sell {

    static void maxProfit(int[] arr){

        int buy = Integer.MAX_VALUE ;
        int maxProfit = Integer.MIN_VALUE ;

        for(int price: arr){


            int sell = price ;

            if(buy>price){
                buy = price ;
            }

            int profit = sell-buy ;

            if(maxProfit < profit){
                maxProfit = profit ;
            }

        }

        System.out.println("Maximum Profit be: " + maxProfit) ;  
    }
    public static void main(String [] args){

        System.out.println("Stock Buy and sell") ;

        int[] price = {7, 1, 5, 3, 6, 4} ; 

        maxProfit(price) ;


    }
    
}
