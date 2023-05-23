class KthLargest {
    ArrayList<Integer> nums = new ArrayList<>();
    int k;

    public KthLargest(int k, int[] nums) {
        for(int num:nums){
            this.nums.add(num);
        }
        this.k=k;
    }
    
    public int add(int val) {
        this.nums.add(val);
        Collections.sort(this.nums);
        return nums.get(this.nums.size()-k);
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */