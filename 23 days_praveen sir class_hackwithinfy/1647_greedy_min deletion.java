class Solution {
    public int minDeletions(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for (char c : s.toCharArray()) {
    map.put(c, map.getOrDefault(c, 0) + 1);
}
        int[] arr1=new int[map.size()];
        //Integer[] arr2=new Integer[map.size()];
        int i=0;
        for(int n:map.values()){
            arr1[i]=n;
            //arr2[i]=n;
            i++;
            }
        Arrays.sort(arr1);
        int c=0;
        
        for(int k=map.size()-2;k>=0;k--){
            while(arr1[k]>=arr1[k+1] && arr1[k]>0){
                arr1[k]--;
                c++;
            }
        }
        return c;
    }
}
