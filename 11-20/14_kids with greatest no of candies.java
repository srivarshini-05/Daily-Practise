class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];  // assume first element is max

        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        List<Boolean> list = new ArrayList<>();
        for(int i:candies){
            if(i+extraCandies>max || i+extraCandies==max){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
        
    }
}
