//string

class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder b=new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                b.append(Character.toLowerCase(c));
            }
        }
        String s1=b.toString();
        String s2=b.reverse().toString();
        return s1.equals(s2);
    }
}

// two pointer
class Solution {
    public boolean isPalindrome(String s) {
        int l=0,r=s.length()-1;
        while(l<r){
            while(l<r && !Character.isLetterOrDigit(s.charAt(l))){
                l++;
            }
            while(l<r && !Character.isLetterOrDigit(s.charAt(r))){
                r--;
            }
            if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
