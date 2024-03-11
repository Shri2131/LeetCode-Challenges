class Solution {
    public String customSortString(String order, String s) {
        String res = "";
        for(int i=0; i<order.length(); i++){
            for(int j=0; j<s.length(); j++){
                if(order.charAt(i)==s.charAt(j)){
                    res+=order.charAt(i);
                    s = s.substring(0,j)+"0"+s.substring(j+1);
                }
            }
        }
        
        for(char ch: s.toCharArray()){
            if(ch=='0'){
                continue;
            }
            res+=ch;
        }
        return res;
    }
}