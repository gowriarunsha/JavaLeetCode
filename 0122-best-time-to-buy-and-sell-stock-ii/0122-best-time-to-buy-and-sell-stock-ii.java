class Solution {
    public int maxProfit(int[] prices) {
        
        int min=Integer.MAX_VALUE;  //buying price - minimized
        int profit=0;   //profit made for stock - maximized
        int total=0;    //total profit made
        
        for(int i=0;i<prices.length;i++)
        {
            //NEW DAY
            
            //BUY STOCK if - new lower price found - or - new profit is lower (selling price higher than buying price )
            //continuously searches for the next minimum
            if(prices[i]<min || prices[i]-min<profit)
            {
                min=prices[i];
                total+=profit;  //add profit of previous stock to total profit
                profit=0;   //profit of new stock bought set to 0
            }
            
            //if profit is higher if sold today
            if(prices[i]-min>profit)
            {
                profit=prices[i]-min;   //new profit for the stock
            }
        }
        
        //profit of last stock bougth added
        return total+profit;
    }
}