class Solution {
    public String mergeAlternately(String word1, String word2) {
        String sol = "";
        int len1 = word1.length();
        int len2 = word2.length();
        for(int i=0; i<Math.max(len1,len2); i++){
            if(i==len1){
                sol+=word2.substring(i,len2);
                break;
            }else if(i==len2){
                sol+=word1.substring(i,len1);
                break;
            }else{
                sol=sol+word1.charAt(i)+word2.charAt(i);
            }
        }
        return sol;
    }
}