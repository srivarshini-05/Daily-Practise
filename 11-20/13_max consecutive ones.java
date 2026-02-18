class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int m=0;
        int c=0;
        for(int i:nums){
            if(i==1){
            c++;
            }
            else if(i==0){
                m=Math.max(c,m);
                c=0;

            }
            
        }
        m=Math.max(c,m);
        return m;
    }
}
