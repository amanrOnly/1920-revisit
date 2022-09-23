class Solution {
public:
    int uniquePaths(int m, int n) {
//         if(n==1 || m==1) return 1;
//         // if(dp[m-1][n-1])    
//         return uniquePaths(m-1, n, dp) + uniquePaths(m, n-1, dp);
           int c = n+m-2;
            int r = m-1;
        double res=1;
        for(int i=1; i<=r; ++i){
            res = res*(c-r+i)/i;
        }
        
        return (int)res;
    }
};
