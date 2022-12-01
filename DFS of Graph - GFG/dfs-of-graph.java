//{ Driver Code Starts
// Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj =
                new ArrayList<ArrayList<Integer>>();
            for (int i = 0; i < V; i++) adj.add(new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.dfsOfGraph(V, adj);
            for (int i = 0; i < ans.size(); i++)
                System.out.print(ans.get(i) + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    
    public ArrayList<Integer> DFS(int i, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ans, int[] vis){
        ans.add(i);
        vis[i]=1;
        for(Integer it: adj.get(i)){
            if(vis[it]==0){
                DFS(it, adj, ans, vis);
            }
        }
        return ans;
    }
    
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        int[] vis = new int[V];
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        for(int i=0; i<V; i++){
            if(vis[i]==0){
                DFS(i, adj, ans, vis);
            }
        }
        
        return ans;
    }
}