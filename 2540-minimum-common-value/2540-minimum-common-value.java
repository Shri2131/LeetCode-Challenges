class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        
        int i1 = 0;
        int i2 = 0;

        while(i1<len1 || i2<len2){
            if(nums1[i1]==nums2[i2]){
                return nums1[i1];
            }else if(nums1[i1]>nums2[i2] && i2+1<len2){
                i2++;
            }else if(i1+1<len1){
                i1++;
            }else{
                break;
            }
        }

        return -1;
    }
}