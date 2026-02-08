//dp
class Solution {
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        //dp[2]=2;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
    }
    return dp[n];
    }
}
//fibbonaci
class Solution {
    public int climbStairs(int n) {
        int a=0,b=1;
        for(int i=0;i<n;i++){
            int c=a+b;
            a=b;
            b=c;
        }
        return b;
    }
}
