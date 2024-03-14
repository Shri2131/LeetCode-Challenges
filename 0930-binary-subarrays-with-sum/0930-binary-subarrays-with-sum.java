class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer,Integer> mp = new HashMap<>();
        int res = 0;
        int currSum = 0;
        for(int num: nums){
            currSum+=num;
            if(currSum==goal){
                res++;
            }
            
            if(mp.containsKey(currSum-goal)){
                res+=mp.get(currSum-goal);
            }
            
            mp.put(currSum,mp.getOrDefault(currSum,0)+1);
        }
        
        return res;
    }
}