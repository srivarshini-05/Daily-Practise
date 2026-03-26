class Solution {
    public int findMinArrowShots(int[][] points) {
        //Arrays.sort(points,(a,b)->(a[0]==b[0]?a[1]-b[1]:a[0]-b[0]));
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        int c=1;
        int n=points.length;
        int a=points[0][1];
        for(int i=1;i<n;i++){
            if(points[i][0]>a){
                c++;
                a=points[i][1];
            }
        }
        return c;

    }
}
