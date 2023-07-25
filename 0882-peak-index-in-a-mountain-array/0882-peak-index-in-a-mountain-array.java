class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        for(int i=1; i<arr.length-1; i++){
            if(arr[i-1]<arr[i] && arr[i+1]<arr[i]){
                return i;
            }
        }
        if(arr[0]<arr[1]){
            return 0;
        }
        return arr.length-1;
    }
}