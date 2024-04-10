class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Queue<Integer> queue = new LinkedList<>();
        int n = deck.length;
        
        for(int i=0; i<n; i++){
            queue.add(i);
        }
        
        Arrays.sort(deck);
        
        int[] res = new int[n];
        
        for(int i=0; i<n; i++){
            res[queue.poll()]=deck[i];
            queue.add(queue.poll());
        }
        
        return res;
    }
}