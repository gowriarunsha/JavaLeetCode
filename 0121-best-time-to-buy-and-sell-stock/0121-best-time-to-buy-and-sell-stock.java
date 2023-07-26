class Solution {
    public int maxProfit(int[] prices) {

        int min=Integer.MAX_VALUE; //price to buy at
        int profit=0;   //max profit

        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){  //updating buying price if lesser price is found
                min=prices[i];
            }

            //if todays profit is higher than set profit
            if(prices[i]-min>profit)
                {profit=prices[i]-min;}
        }
        
        return profit;
    }
}
