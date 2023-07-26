class Solution {
    public int maxProfit(int[] prices) {
        
        int min=Integer.MAX_VALUE;
        int profit=0;
        int profittoday=0;
        int total=0;
        int sold=-1;
        
        for(int i=0;i<prices.length;i++)
        {
            System.out.println("NEW DAY");
            if(prices[i]<min)
            {
                min=prices[i];
                System.out.println("BUY STOCK AT:"+min);
            }
            
            profittoday=prices[i]-min;
            System.out.println("should we sell at"+prices[i]+"? for profit"+profittoday+"?");
            
            //if(sold<prices[i] && profittoday>profit)
            if(profittoday>profit)
            {
                System.out.println("YES new highest price");
                sold=prices[i];
                total+=profittoday-profit;
                profit=profittoday;
                System.out.println("profit made:"+profit);
            }
            else{
                System.out.println("Dont sell. Buy stock");
                min=prices[i];
                profit=0;
            }
            /*
            else if(sold>prices[i])
            {
                total+=profit;
                min=prices[i];
                profit=0;
                
            }
            
            if(sold<prices[i])
            {
                sold=prices[i];
                profit=profittoday;
                //total=total-profit+profittoday;
            }
            */
            
        }
        return total;
    }
}