class Solution {
    public int[][] reconstructQueue(int[][] people) {
        int n=people.length;
        Arrays.sort(people,(a,b)->{
            if(a[0]==b[0]){
                return a[1]-b[1];
            }
            else{
                return b[0]-a[0];
            }
        });
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        //list.add(index, element);
        for(int i=0;i<n;i++){
            ArrayList<Integer> a=new ArrayList<>(n);
            a.add(people[i][0]);
            a.add(people[i][1]);
            ans.add(people[i][1],a);
            
        }
        int rows = ans.size();
int cols = ans.get(0).size();
        int[][] arr = new int[rows][cols];

for (int i = 0; i < rows; i++) {
    for (int j = 0; j < cols; j++) {
        arr[i][j] = ans.get(i).get(j);
    }
}
        return arr;
    }
}
