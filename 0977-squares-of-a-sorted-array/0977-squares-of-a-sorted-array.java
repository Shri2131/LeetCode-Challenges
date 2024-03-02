// class Solution {
//     public int[] sortedSquares(int[] nums) {
//         for(int i=0; i<nums.length; i++){
//             nums[i]=nums[i]*nums[i];
//         }
//         Arrays.sort(nums);
//         return nums;
//     }
// }
class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int index = nums.length-1;
        int res[] = new int[nums.length];

        while(left<=right){
            int square = 0;
            if(Math.abs(nums[left])>Math.abs(nums[right])){
                square = (int)Math.pow(nums[left],2);
                left++;
            }else{
                square = (int)Math.pow(nums[right],2);
                right--;
            }
            res[index] = square;
            index--;
        }

        return res;
    }
}