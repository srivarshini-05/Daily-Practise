class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs,(a,b)->Integer.compare(a[0]-a[1],b[0]-b[1]));
        int l=costs.length;
        int n=costs.length/2;
        int t=0;
        for(int i=0;i<n;i++){
            t+=costs[i][0];
        }
        for(int i=l-1;i>=n;i--){
            t+=costs[i][1];
        }
        return t;
            }
}
