class Solution {
    public int maxProfit(int[] prices) {
        
        int min=Integer.MAX_VALUE;  //buying price - minimized
        int profit=0;   //profit made for stock - maximized
        //int profittoday=0;  //profit made if sold today
        int total=0;    //total profit made
        
        for(int i=0;i<prices.length;i++)
        {
            //NEW DAY
            System.out.println("NEW DAY");
            if(prices[i]<min || prices[i]-min<profit)
            {
                System.out.println("Buy new stock");
                //BUY STOCK AT new min price
                min=prices[i];
                total+=profit;
                profit=0;
            }
            
            //if profit is higher if sold today - 
            if(prices[i]-min>profit)
            {
                System.out.println("YES new highest price");
                //total+=profittoday-profit;
                profit=prices[i]-min;
                System.out.println("profit made:"+profit);
            }
            /*
            else{
                total+=profit;
                System.out.println("Dont sell. Buy stock");
                min=prices[i];
                profit=0;
            }
            */
        }
        
        total+=profit;
        return total;
    }
}