//sorting
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
//two pointer
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int l=0,r=n-1;
        int pos=n-1;
        int[] re=new int[n];
        while(l<=r){
            int ls=nums[l]*nums[l];
            int rs=nums[r]*nums[r];
            if(ls>rs){
                re[pos]=ls;
                l++;
            }
            else{
                re[pos]=rs;
                r--;
            }
            pos--;
        }
        return re;
    }
}
