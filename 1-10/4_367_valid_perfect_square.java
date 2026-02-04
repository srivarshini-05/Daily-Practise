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
class Solution {
    public boolean isPerfectSquare(int num) {
        long l=1,r=num;
        while(l<=r){
            long m=l+(r-l)/2;
            long s=m*m;
            if(s==num) return true;
            else if(s<num){
                l=m+1;
            }
            else{
                r=m-1;
            }
        }
        return false;
    }
}
