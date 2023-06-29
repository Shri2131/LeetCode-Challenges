class Solution {
    public String longestPrefix(String s) {
        int M = s.length();
        int[] lps = new int[M];
        lps[0]=0;
        int len=0;
        int i=1;
        while(i<M){
            if(s.charAt(i)==s.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }else{
                if(len!=0){
                    len=lps[len-1];
                }else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        return s.substring(0,lps[M-1]);
    }
}