class Solution {
    public int largestAltitude(int[] gain) {
        int[] newArr = new int[gain.length+1];
        newArr[0] = 0;
        for(int i=0; i<gain.length; i++){
            newArr[i+1]=newArr[i]+gain[i];
        }
        Arrays.sort(newArr);
        return newArr[newArr.length-1];
    }
}