import java.util.*;

class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);

        for(int i = 1; i < nums.length; i += 2){
            if(nums[i] != nums[i-1]){
                return nums[i-1];
            }
        }

        return nums[nums.length - 1];
    }
}

//xor
class Solution {
    public int singleNumber(int[] nums) {
        //Arrays.sort(nums);
        int ans=0;
        for(int i=0;i<nums.length;i++){
           ans^=nums[i];
        }
        return ans;
    }
}
