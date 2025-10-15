public class Tut_64 {
    static int buyAndSellStocks(int prices[]) {
        //profit = selling price - buying price
        int buyingPrices = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0;i<prices.length;i++){
            if (buyingPrices<prices[i]){
                int Profit = prices[i] - buyingPrices;
                maxProfit = Math.max(maxProfit,Profit);

            }else {
                buyingPrices = prices[i];
            }
        }
        return maxProfit;
    }
    static void main(String[] args) {
      int prices[] = {7,1,2,3,6,2};
        System.out.println(buyAndSellStocks(prices));
    }
}
