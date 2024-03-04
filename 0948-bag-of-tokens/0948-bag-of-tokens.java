class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int score = 0;
        int min = 0;
        int max = tokens.length-1;
        while(min<=max){
            if(power>=tokens[min]){
                power-=tokens[min];
                score++;
                min++;
            }else if(score>0 && max-min>0){
                power+=tokens[max];
                score--;
                max--;
            }else{
                break;
            }
            System.out.println(power);
        }
        
        // for(int i=0; i<tokens.length; i++){
        //     if(power>=tokens[i]){
        //         power-=tokens[i];
        //         score++;
        //     }else if(score>0){
        //         score--;
        //         power+=tokens[i];
        //     }
        // }
        return score;
    }
}