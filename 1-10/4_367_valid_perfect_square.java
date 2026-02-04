//math mtd 1
class Solution {
    public boolean isPerfectSquare(int num) {
       if(num==1)return true;
        long c=2;
        while(c<=num){
            if(c*c==num){
                return true;
            }
            c++;
        }
        return false;
    }
}
//mtd 2 binary search
