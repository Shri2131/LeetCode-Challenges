class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int ans=0;
        int start=-1;
        Map<Integer,Integer> mp = new HashMap<>();
        for(int end=0; end<nums.length; end++){
            mp.put(nums[end],mp.getOrDefault(nums[end],0)+1);
            while(mp.get(nums[end])>k){
                start++;
                mp.put(nums[start],mp.get(nums[start])-1);
            }
            ans = Math.max(ans,end-start);
        }
        return ans;
    }
}