class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
       int i = 0;
       if(flowerbed.length==1){
           if(flowerbed[0]==0){
               n--;
           }
       }
       while(i<flowerbed.length && n>0){
           if(i==0 && flowerbed[i]==0 && flowerbed[i+1]==0){
               flowerbed[i]=1;
               n--;
               continue;
           }else if(i!=0 && i==flowerbed.length-1 && flowerbed[i-1]==0 && flowerbed[i]==0){
               flowerbed[i]=1;
               n--;
               continue;
           }else if(i!=0 && i!=flowerbed.length-1 && flowerbed[i-1]==0 && flowerbed[i+1]==0 && flowerbed[i]==0){
               flowerbed[i]=1;
               n--;
           }
           i++;
       } 
       if(n<=0){
           return true;
       }
       return false;
    }
}