class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> lst = new ArrayList<>();
        Map<Integer,Integer> mp1 = new HashMap<>();
        for(int num: nums1){
            mp1.put(num,mp1.getOrDefault(num,0)+1);
        }
        for(int num: nums2){
            if(mp1.containsKey(num)){
                lst.add(num);
                mp1.remove(num);
            }
        }
        
        int[] result = new int[lst.size()];
        for (int i = 0; i < lst.size(); i++) {
            result[i] = lst.get(i);
        }
        return result;
    }
}