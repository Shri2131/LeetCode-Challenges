class Solution {
    public String reversePrefix(String word, char ch) {
        int start = 0;
        int end = 0;
        
        char[] wordArr = word.toCharArray();
        
        for(char c : wordArr){
            if(c==ch){
                break;
            }
            end++;
        }
        
        if(end==word.length()){
            return word;
        }
        
        for(start=0; start<end; start++, end--){
            char temp = wordArr[start];
            wordArr[start] = wordArr[end];
            wordArr[end] = temp;
        }
        
        return new String(wordArr);
    }
    
//     public String reverse(String word, int start, int end){
        
//     }
}