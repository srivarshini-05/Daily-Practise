//greedy--->local optimal solution,90% sort,10% without sort(key words--->minimum,maximum,shortcut,largest)
//122----->DP
class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        if(n==1){
            return 0;
        }
        int[] dp=new int[n-1];
        dp[0]=prices[1]-prices[0];
        for(int i=2;i<n;i++){
            int d=prices[i]-prices[i-1];
            if(d>0 && dp[i-2]>0){
                dp[i-1]=d+dp[i-2];

            }
            else if(d>0){
                dp[i-1]=d;
            }
            else if(dp[i-2]>0){
                dp[i-1]=dp[i-2];
            }
            else{
                dp[i-1]=Math.max(d,dp[i-2]);
            }
        }
        if(dp[n-2]<0){
            return 0;
        }
        else{
            return dp[n-2];
        }
    }
}
