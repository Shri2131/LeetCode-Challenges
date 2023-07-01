class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        int i=-1,j=-1,k=-1;
        for(i=0;i<nums.length-2;i++){
            j = i + 1;
            k = nums.length - 1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum==0){
                    set.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                }else if(sum > 0){
                    k--;
                }else if(sum < 0){
                    j++;
                }
            }
        }
        return new ArrayList<>(set);
    }
}
