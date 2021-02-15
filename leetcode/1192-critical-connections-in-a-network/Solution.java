class Solution {
    
    int timer = 0;
    boolean[] visited;
    int[] timestamp;
    List<List<Integer>> result;
    List<Integer>[] graph;
    
    
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        graph = new ArrayList[n];
        for (int i = 0; i < n; i++) graph[i] = new ArrayList<>();
        
        visited = new boolean[n];
        timestamp = new int[n];
        result = new ArrayList<>();
        
        for(List<Integer> oneConnection :connections) {
            graph[oneConnection.get(0)].add(oneConnection.get(1));
            graph[oneConnection.get(1)].add(oneConnection.get(0));
        }
        
        criticalConnectionsUtil(-1, 0);
        return result;
    }
    
    public void criticalConnectionsUtil(int parent, int node) {
        visited[node] = true;
        timestamp[node] = timer++;
        int currentTimestamp = timestamp[node];
        
        for(int neighbor : graph[node]) {
            if(neighbor == parent) continue;
            
            if(!visited[neighbor]) criticalConnectionsUtil(node, neighbor);
            
            timestamp[node] = Math.min(timestamp[node], timestamp[neighbor]);
            
            if(currentTimestamp < timestamp[neighbor]) result.add(Arrays.asList(node, neighbor));
        }        
    }
}