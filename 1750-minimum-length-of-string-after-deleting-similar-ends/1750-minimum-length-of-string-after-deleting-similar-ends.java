class Solution {
    public int minimumLength(String s) {
        int start = 0;
        int end = s.length()-1;
        while(start<end && s.charAt(start)==s.charAt(end)){
            char curr = s.charAt(start);
            while(start<=end && s.charAt(start)==curr){
                start++;
            }
            while(start<=end && s.charAt(end)==curr){
                end--;
            }
        }

        return Math.max(0,end-start+1);
    }
}