class Solution {
    public void fun(List<String> l,String curr,int oc,int cc,int n){
            if(n*2==curr.length()){
                l.add(curr);
                return;
            }
            if(oc<n){
                fun(l,curr+"(",oc+1,cc,n);
            }
            if(cc<oc){
                fun(l,curr+")",oc,cc+1,n);
            }
        }
    public List<String> generateParenthesis(int n) {
        List<String> l=new ArrayList<>();
        fun(l,"",0,0,n);
        return l;
        
    }
}
