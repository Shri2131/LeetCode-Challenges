class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> solList = new ArrayList<>();
        int maxVal = Integer.MIN_VALUE;
        for(int i: candies){
            maxVal = Math.max(maxVal,i);
        }
        for(int i:candies){
            if(i+extraCandies<maxVal){
                solList.add(false);
            }else{
                solList.add(true);
            }
        }

        return solList;
    }
}