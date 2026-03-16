class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int n1=players.length;
        int n2=trainers.length;
        int i=0;
        int j=0;
        while(i<n1 && j<n2){
            if(players[i]<=trainers[j]){
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return i;
    }
}
