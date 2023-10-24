class Solution {
    public String reverseWords(String s) {
        List<String> lst = new ArrayList<>();
        String words[] = s.split(" ");
        for(String str: words){
            if(!"".equals(str)){
                lst.add(str);
            }
        }
        String res="";
        for(String str: lst){
            res=str+" "+res;
        }
        return res.trim();
    }
}