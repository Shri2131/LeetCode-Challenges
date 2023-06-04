class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];
        int count=0;

        for(int i=0; i<isConnected.length; i++){
            if(!visited[i]){
                count++;
                dfs(isConnected,visited,i);
            }
        }
        return count;
    }
    public static void dfs(int[][] isConnected, boolean[] checked, int num){
        checked[num]=true;
        for(int i=0; i<checked.length; i++){
            if(isConnected[num][i]==1 && !checked[i]){
                dfs(isConnected,checked,i);
            }
        }
    }
}