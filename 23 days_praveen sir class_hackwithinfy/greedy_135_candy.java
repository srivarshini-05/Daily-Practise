class Solution {
    public int candy(int[] ratings) {
        int[] dp=new int[ratings.length];
        Arrays.fill(dp,1);
        for(int i=1;i<ratings.length;i++){
            if(ratings[i]>ratings[i-1]){
                dp[i]=dp[i-1]+1;
            }
        }
        for(int i=ratings.length-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                dp[i]=Math.max(dp[i+1]+1,dp[i]);
            }
        }
        int c=0;
        for(int i=0;i<dp.length;i++){
            c+=dp[i];
        }
        return c;
    }
}

//method 2 ,2 array
class Solution {
    public int candy(int[] ratings) {
        int[] dp=new int[ratings.length];
        int[] dp1=new int[ratings.length];
        Arrays.fill(dp,1);
        Arrays.fill(dp1,1);
        for(int i=1;i<ratings.length;i++){
            if(ratings[i]>ratings[i-1]){
                dp[i]=dp[i-1]+1;
            }
        }
    
        for(int i=ratings.length-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                dp1[i]=dp1[i+1]+1;
            }
        }
        int c=0;
        for(int i=0;i<dp.length;i++){
            c+=Math.max(dp[i],dp1[i]);
        }
        return c;
    }
}
