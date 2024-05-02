class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length-1;
        
        while(start<end){
            if((0-nums[start])==nums[end]){
                return nums[end];
            }else if((0-nums[start])>nums[end]){
                start++;
            }else{
                end--;
            }
        }
        
        return -1;
    }
}