class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int val = tickets[k];
        int n = tickets.length;
        int total = 0;
        for(int i=0; i<n; i++){
            if(i<=k){
                total+=Math.min(val,tickets[i]);   
            }else{
                total+=Math.min(val-1,tickets[i]);  
            }
        }
        return total;
    }
}