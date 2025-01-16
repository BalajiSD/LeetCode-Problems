class Solution {
    public int maxProfit(int[] prices) {
        int value=0;
        int minValue=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minValue){
                minValue=prices[i];
            }
            int profit=prices[i]-minValue;
            if(profit>value){
                value=profit;
            }
        }
        return value;
    }
}