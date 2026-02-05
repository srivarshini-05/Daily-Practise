// string
class Solution {
    public boolean isValid(String s) {
        while(s.contains("()") || s.contains("{}") || s.contains("[]")){
            s=s.replace("()","");
            s=s.replace("[]","");
            s=s.replace("{}","");
        }
        return s.length()==0;
    }
}

//stack
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char i:s.toCharArray()){
            if(i=='('){
                st.push(')');
            }
            else if(i=='['){
                st.push(']');
            }
            else if(i=='{'){
                st.push('}');
            }
            else if(st.isEmpty() || i!=st.pop()){
                return false;
            }
        }
        return st.size()==0;
    }
}
